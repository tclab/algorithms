package com.tclab.algorithms.sorting;

import com.tclab.algorithms.utils.Utils;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class InsertionSortTest {

  @Test
  void sort() {
    List<Integer> list = Utils.randomList(10);
    System.out.format("List before: %s", list);
    list = InsertionSort.sort(list);
    System.out.format("%nList after: %s", list);

    Assertions.assertEquals("[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]", list.toString());
  }
}
