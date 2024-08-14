package com.hjusic.shelly.model.configuration;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Location {
  private String timezone;
  private String latitude;
  private String longitude;
}
