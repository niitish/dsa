public class L704 {
  public int search(int[] nums, int target) {
    int f = 0, l = nums.length - 1;

    while (f <= l) {
      int m = (f + l) / 2;
      if (target < nums[m])
        l = m - 1;
      else if (target > nums[m])
        f = m + 1;
      else
        return m;
    }

    return -1;
  }
}