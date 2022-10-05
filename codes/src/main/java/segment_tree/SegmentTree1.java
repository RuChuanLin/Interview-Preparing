package segment_tree;

public class SegmentTree1 {
  int[] nums;
  Node root;

  public SegmentTree1(int[] nums) {
    this.nums = nums;
    this.root = buildSegmentTree(0, nums.length - 1);
  }

  public static void main(String[] args) {
    SegmentTree1 o = new SegmentTree1(new int[]{1, 2, 3, 4, 5, 6});
    System.out.println(o.sumRange(0, 3));  // 10
    o.update(2, 10);
    System.out.println(o.sumRange(1, 2)); // 12
    o.update(3, 20);
    System.out.println(o.sumRange(0, 3)); // 33
  }

  private void update(int index, int val) {
    Node cur = root;
    int diff = val  - nums[index] ;
    nums[index] = val;
    while (cur != null) {
      cur.sum += diff;
      int m = (cur.end - cur.start) / 2 + cur.start;
      if (m >= index) {
        cur = cur.left;
      } else {
        cur = cur.right;
      }
    }
  }

  private int sumRange(int l, int r) {
    return sum(root, l, r);
  }

  private int sum(Node root, int l, int r) {
    if (root.start == l && root.end == r) {
      return root.sum;
    }
    int m = (root.end - root.start) / 2 + root.start;
    if (m >= r) {
      return sum(root.left, l, r);
    } else if (m + 1 <= l) {
      return sum(root.right, l, r);
    }

    return sum(root.left, l, m) + sum(root.right, m + 1, r);
  }

  private Node buildSegmentTree(int l, int r) {
    Node newNode = new Node(l, r);
    if (l == r) {
      newNode.sum = nums[l];
    } else {
      int m = (r - l) / 2 + l;
      newNode.left = buildSegmentTree(l, m);
      newNode.right = buildSegmentTree(m + 1, r);
      newNode.sum = newNode.left.sum + newNode.right.sum;
    }
    return newNode;
  }

  static class Node {
    int start, end, sum;
    Node left, right;

    Node(int start, int end) {
      this.start = start;
      this.end = end;
    }
  }

}
