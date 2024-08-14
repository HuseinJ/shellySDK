package com.hjusic.shelly.model.schedule;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Schedule {

  private int number;
  private boolean enabled;
  private String timespec;

  //todo: add calls
}
