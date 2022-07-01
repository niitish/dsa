public class L1855 {
  public int search(int[] nums, int t, int i) {
    int l = 0, h = Math.min(nums.length - 1, i);

    while (l < h) {
      int m = l + (h - l) / 2;
      if (nums[m] <= t) {
        h = m;
      } else {
        l = m + 1;
      }
    }

    return l;
  }

  public int maxDistance(int[] nums1, int[] nums2) {
    int max = -1;
    for (int i = 0; i < nums2.length; i++) {
      int j = search(nums1, nums2[i], i);
      if (nums1[j] <= nums2[i])
        max = Math.max(i - j, max);
    }

    return max == -1 ? 0 : max;
  }
}