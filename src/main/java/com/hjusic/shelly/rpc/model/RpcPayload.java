package com.hjusic.shelly.rpc.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import lombok.ToString;

@Getter
@Builder
@ToString
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class RpcPayload {
  @Builder.Default
  private final int id = 1; // Default ID

  @NonNull
  @Builder.Default
  private final String method = "Shelly.GetDeviceInfo"; // Default method

  public String toJson() {
    return String.format("{\"id\":%d,\"method\":\"%s\"}", id, method);
  }
}