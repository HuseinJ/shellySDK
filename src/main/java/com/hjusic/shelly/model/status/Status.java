package com.hjusic.shelly.model.status;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Status {
  private String mac;
  private boolean updateRequired;
  private String time;
  private int unixTime;
  private int uptime;
  private int ramSize;
  private int ramFree;
  private int fsSize;
  private int fsFree;
  private int cfgRev;
  private int kvsRef;
  private int scheduleRef;
  private int webhookRev;
  private int knxRef;
  private int wakeupPeriod;

  private AvailableUpdates availableUpdates;
  private WakeUpReason wakeUpReason;
}
