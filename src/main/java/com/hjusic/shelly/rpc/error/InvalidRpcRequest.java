package com.hjusic.shelly.rpc.error;

public class InvalidRpcRequest extends RpcError{

  public InvalidRpcRequest(String message) {
    super("Invalid Rpc Request with reason: " + message);
  }

  @Override
  public String getMessage() {
    return super.message;
  }
}
