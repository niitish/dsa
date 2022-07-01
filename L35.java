public class L35 {
  public int searchInsert(int[] nums, int target) {
    int f = 0, l = nums.length - 1, r = 0;
    while (f <= l) {
      int m = l + (f - l) / 2;
      if (target == nums[m]) {
        return m;
      } else if (target < nums[m]) {
        l = m - 1;
      } else {
        f = m + 1;
        r = m + 1;
      }
    }
    return r;
  }
};