package com.hjusic.shelly.rpc.error;

import lombok.AllArgsConstructor;

@AllArgsConstructor
abstract public class RpcError {
  protected final String message;

  abstract public String getMessage();
}
