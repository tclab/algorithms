package com.tclab.algorithms.search;

import com.tclab.algorithms.utils.Utils;
import java.util.List;
import java.util.Random;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BinarySearchTest {

  @Test
  void search() {
    int size = 100;
    List<Integer> list = Utils.sortedList(size);
    int key = list.get(new Random().nextInt(size));

    Integer index = BinarySearch.search(list, key);

    System.out.printf("%nList: %s", list);
    System.out.printf("%nKey: %d, index: %d", key, index);

    Assertions.assertEquals(index, key);
  }
}
