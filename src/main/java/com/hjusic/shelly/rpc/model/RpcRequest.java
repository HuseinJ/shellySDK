package com.hjusic.shelly.rpc.model;

import lombok.Builder;
import lombok.Getter;
import lombok.AllArgsConstructor;
import lombok.AccessLevel;
import lombok.NonNull;

@Getter
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class RpcRequest {
  @Builder.Default
  private final String method = "POST";

  @Builder.Default
  private final String contentType = "application/json";

  @NonNull
  private final RpcUrl url;

  @NonNull
  private final RpcPayload payload;

  @Builder.Default
  private final int timeout = 5000; // Default timeout
}