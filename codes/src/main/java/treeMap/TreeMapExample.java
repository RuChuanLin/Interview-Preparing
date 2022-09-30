package treeMap;

import java.util.TreeMap;

public class TreeMapExample {

  public static void main(String[] args) {
    TreeMap<Integer, Integer> tm = new TreeMap<>();

    for (int i = 1; i <= 15; i++) {
      tm.put(i, i);
    }

    System.out.println(tm);
  }

  static class Dummy {
    int num = 0;
    String str = "1";
  }
}
