package com.tclab.algorithms.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Utils {

  public static List<Integer> randomList(int size) {
    Random random = new Random();
    List<Integer> list = new ArrayList<Integer>();
    for (int i = 0; i < size; i++) {
      int randNum = random.nextInt(size);
      while (list.contains(randNum)) {
        randNum = random.nextInt(size);
      }
      list.add(randNum);
    }
    return list;
  }

  public static List<Integer> sortedList(int size) {
    List<Integer> list = new ArrayList<Integer>();
    for (int i = 0; i < size; i++) {
      list.add(i);
    }
    return list;
  }
}
