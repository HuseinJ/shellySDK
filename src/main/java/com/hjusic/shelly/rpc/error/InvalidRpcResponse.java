package com.hjusic.shelly.rpc.error;

import lombok.AllArgsConstructor;

public class InvalidRpcResponse extends RpcError {

  public InvalidRpcResponse() {
    super("Invalid RPC response");
  }

  @Override
  public String getMessage() {
    return super.message;
  }
}
