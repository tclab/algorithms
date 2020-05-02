package com.tclab.algorithms.search;

import java.util.ArrayList;
import java.util.List;

public class BinarySearch {

  /**
   * Returns the index of the element we are looking for
   * Complexity: O(log n)
   *
   * @param list
   * @param key
   * @return value we are looking for
   */
  public static Integer search(List<Integer> list, int key) {
    if (list.isEmpty()) {
      return null;
    }

    int i = list.size() / 2;
    if (list.get(i).equals(key)) {
      System.out.printf("Key: %d, index of %d = %d", key, key, i);
      return list.get(i);
    }

    List<Integer> slice = new ArrayList<Integer>();
    if (key > list.get(i)) {
      slice = list.subList(i + 1, list.size());
    } else {
      slice = list.subList(0, i - 1);
    }

    return search(slice, key);
  }
}

