package com.hjusic.shelly.model.status;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class WakeUpReason {
  private Boot reason;
  private Cause cause;
}
