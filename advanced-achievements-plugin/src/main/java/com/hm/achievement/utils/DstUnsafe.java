package com.hm.achievement.utils;

public class DstUnsafe {

  @SuppressWarnings("unchecked") // i know what i do
  public static <E extends Throwable, R extends RuntimeException> R throwImpl(Throwable e) throws E {
    throw (E) e;
  }
}
