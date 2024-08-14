package com.hjusic.shelly.model.status;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class AvailableUpdates {
  private Beta beta;
  private Stable stable;
}
