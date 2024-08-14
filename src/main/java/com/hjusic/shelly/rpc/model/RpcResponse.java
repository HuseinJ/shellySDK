package com.hjusic.shelly.rpc.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class RpcResponse {
  @Builder.Default
  private String rpcResponse = "";
}