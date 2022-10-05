package binary_index_tree;

public class BIT1 {

  int[] nums;
  int[] tree;

  public BIT1(int[] nums) {
    int len = nums.length;
    this.nums = new int[len];
    this.tree = new int[len + 1];
    for (int i = 0; i < len; i++) {
      update(i, nums[i]);
    }
  }

  public static void main(String[] args) {
    BIT1 o = new BIT1(new int[]{1, 2, 3, 4, 5, 6});
    System.out.println(o.sumRange(0, 3));  // 10
    o.update(2, 10);
    System.out.println(o.sumRange(1, 2)); // 12
    o.update(3, 20);
    System.out.println(o.sumRange(0, 3)); // 33
  }

  private int sumRange(int l, int r) {
    return sumRange(r) - sumRange(l - 1);
  }

  private int sumRange(int index) {
    int res = 0;
    for (int i = index + 1; i > 0; i -= (i & -i)) {
      res += tree[i];
    }
    return res;
  }

  private void update(int index, int val) {
    int diff = val - nums[index];
    nums[index] = val;
    for (int i = index + 1; i < tree.length; i += (i & -i)) {
      tree[i] += diff;
    }
  }
}
