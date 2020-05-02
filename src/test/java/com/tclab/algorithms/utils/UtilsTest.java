package com.tclab.algorithms.utils;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UtilsTest {

  Utils utils;

  @BeforeEach
  void before() {
    utils = new Utils();
  }

  @Test
  void randomList() {
    System.out.println(utils.randomList(10));
  }

}
