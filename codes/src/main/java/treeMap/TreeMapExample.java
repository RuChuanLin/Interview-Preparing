package treeMap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

  public static void main(String[] args) {
    TreeMap<Integer, Integer> tm = new TreeMap<>();

    for (int i = 1; i <= 15; i += 2) {
      tm.put(i, i);
    }

    System.out.println(tm.higherEntry(11)); // 13=13
    System.out.println(tm.lowerEntry(11)); // 9=9

    System.out.println(tm.floorEntry(10)); // 9=9
    System.out.println(tm.ceilingEntry(10)); // 11=11
    System.out.println(tm.headMap(5)); // {1=1, 3=3}
    System.out.println(tm.pollFirstEntry()); // 1=1
    System.out.println(tm.pollLastEntry()); // 15=15

    System.out.println(tm); // {3=3, 5=5, 7=7, 9=9, 11=11, 13=13}
  }

  static class Dummy {
    int num = 0;
    String str = "1";
  }
}
