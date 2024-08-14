package com.hjusic.shelly.model.configuration;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Configuration {
  private Device device;
  private Location location;
  private Debug debug;
  private UiData uiData;
  private RpcUdp rpcUdp;
  private Sntp sntp;
  private int cfgRevision;
}
