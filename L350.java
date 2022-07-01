import java.util.ArrayList;
import java.util.Arrays;

class L350 {
  public int[] intersect(int[] nums1, int[] nums2) {
    Arrays.sort(nums1);
    Arrays.sort(nums2);
    ArrayList<Integer> res = new ArrayList<>();
    int i = 0, j = 0;

    while (i < nums1.length && j < nums2.length) {
      if (nums1[i] == nums2[j]) {
        res.add(nums1[i]);
        i++;
        j++;
      } else if (nums1[i] < nums2[j]) {
        i++;
      } else {
        j++;
      }
    }
    return res.stream().mapToInt(x -> x).toArray();
  }
}