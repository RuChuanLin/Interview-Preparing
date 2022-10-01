package treeMap;

import java.util.TreeSet;

public class TreeSetExample {
  public static void main(String[] args) {
    TreeSet<Integer> ts = new TreeSet<>();
    for (int i = 1; i < 15; i += 2) {
      ts.add(i);
    }

    System.out.println(ts.floor(10));
    System.out.println(ts.ceiling(10));
    System.out.println(ts.lower(11));
    System.out.println(ts.higher(11));
    System.out.println(ts.headSet(5));
    System.out.println(ts.headSet(5, true));
//    ts.p
  }
}
