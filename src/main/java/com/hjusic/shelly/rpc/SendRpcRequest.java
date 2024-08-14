package com.hjusic.shelly.rpc;

import com.hjusic.shelly.rpc.error.InvalidRpcRequest;
import com.hjusic.shelly.rpc.error.InvalidRpcResponse;
import com.hjusic.shelly.rpc.error.RpcError;
import com.hjusic.shelly.rpc.model.RpcRequest;
import com.hjusic.shelly.rpc.model.RpcResponse;
import io.vavr.control.Either;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.util.Scanner;

public class SendRpcRequest {

  public static Either<RpcError, RpcResponse> sendRpcRequest(RpcRequest request) {
    request.getUrl().getUrl();
    try {
      HttpURLConnection connection = (HttpURLConnection) request.getUrl().getUrl().openConnection();
      connection.setRequestMethod(request.getMethod());
      connection.setRequestProperty("Content-Type", request.getContentType());
      connection.setConnectTimeout(request.getTimeout());
      connection.setReadTimeout(request.getTimeout());
      connection.setDoOutput(true);

      try (OutputStream os = connection.getOutputStream()) {
        byte[] input = request.getPayload().toJson().getBytes("utf-8");
        os.write(input, 0, input.length);
      }

      if (connection.getResponseCode() == 200) {
        try (Scanner scanner = new Scanner(connection.getInputStream(), "UTF-8")) {
          var result = scanner.useDelimiter("\\A").next();
          return Either.right(RpcResponse.builder().rpcResponse(result).build());
        }
      } else {
        return Either.left(new InvalidRpcResponse());
      }

    } catch (Exception e) {
      return Either.left(new InvalidRpcRequest(e.getMessage()));
    }
  }
}
