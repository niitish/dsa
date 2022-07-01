public class L34 {
  public int[] searchRange(int[] nums, int target) {
    if (nums.length < 1)
      return new int[] { -1, -1 };

    int l = 0, h = nums.length - 1;
    int ans[] = { -1, -1 };
    while (l <= h) {
      int m = l + (h - l) / 2;
      if (nums[m] == target) {
        ans[0] = m;
        h = m - 1;
      } else if (nums[m] > target) {
        h = m - 1;
      } else {
        l = m + 1;
      }
    }

    l = 0;
    h = nums.length - 1;
    while (l <= h) {
      int m = l + (h - l) / 2;
      if (nums[m] == target) {
        ans[1] = m;
        l = m + 1;
      } else if (nums[m] > target) {
        h = m - 1;
      } else {
        l = m + 1;
      }
    }

    return ans;
  }
}
