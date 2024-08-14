package com.hjusic.shelly.model.configuration;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Device {
  private String name;
  private boolean ecoMode;
  private String mac;
  private String fw_id;
  private String profile;
  private boolean discoverable;
  private String addon_type;
  private boolean sysButtonToggle;
}
