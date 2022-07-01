public class L33 {
  public int search(int[] nums, int target) {
    int n = nums.length;
    int l = 0, h = n - 1;
    while (l < h) {
      int m = l + (h - l) / 2;
      if (nums[m] > nums[h])
        l = m + 1;
      else
        h = m;
    }

    int r = l;
    l = 0;
    h = n - 1;
    while (l <= h) {
      int m = l + (h - l) / 2;
      int x = (m + r) % n;
      if (nums[x] == target)
        return x;
      else if (nums[x] < target)
        l = m + 1;
      else
        h = m - 1;
    }
    return -1;
  }
}
