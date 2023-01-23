package com.theatre.domain;

import java.time.LocalTime;

public enum ShowType {

  M,
  AF,
  E,
  N;

  public static ShowType showType(LocalTime localTime) {
    if (localTime.getHour() < 12) {
      return ShowType.M;
    }
    if (localTime.getHour() < 17) {
      return ShowType.AF;
    }
    if (localTime.getHour() < 20) {
      return ShowType.E;
    }
    return ShowType.N;
  }

}
