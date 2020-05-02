package com.tclab.algorithms.sorting;

import java.util.List;

/**
 * O(n)
 */
public class InsertionSort {

  public static List<Integer> sort(List<Integer> list) {
    for (int i = 1; i < list.size(); i++) {
      int j = i;
      while (j > 0 && list.get(j - 1) > list.get(j)) {
        int a = list.get(j - 1);
        int b = list.get(j);
//        System.out.format("\ni: %d, j: %d, j-1: %d, j: %d",i, j, a, b);
        list.set(j, a);
        list.set(j - 1, b);
//        System.out.printf(", list[j-1]: %d, list[j]: %d", list.get(j - 1), list.get(j));
        j--;
      }
    }
    return list;
  }
}
