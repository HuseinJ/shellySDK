package com.hjusic.shelly.rpc.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import java.net.URL;

@Getter
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class RpcUrl {
  @NonNull
  private final URL url;
}