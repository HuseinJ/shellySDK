package com.hjusic.shelly.rpc;

import static org.junit.jupiter.api.Assertions.*;

import com.hjusic.shelly.rpc.model.RpcPayload;
import com.hjusic.shelly.rpc.model.RpcRequest;
import com.hjusic.shelly.rpc.model.RpcUrl;
import java.net.MalformedURLException;
import java.net.URL;
import org.junit.Test;

public class SendRpcRequestTest {

  @Test
  public void testSendRpcRequest() throws MalformedURLException {
    var rpcRequest = RpcRequest.builder()
        .url(RpcUrl.builder().url(new URL("http://192.168.178.28/rpc/")).build())
        .payload(RpcPayload.builder().method("Shelly.GetDeviceInfo").build())
        .build();

    var result = SendRpcRequest.sendRpcRequest(rpcRequest);

    assertNotNull(result);
  }

}