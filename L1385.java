import java.util.Arrays;

public class L1385 {
  int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
    Arrays.sort(arr2);
    System.out.println(Arrays.toString(arr2));
    int ans = 0;
    for (int i : arr1)
      ans += count(arr2, i, d);
    return ans;
  }

  int count(int[] arr, int t, int d) {
    int l = 0, h = arr.length - 1;

    while (l <= h) {
      int m = l + (h - l) / 2;
      if (Math.abs(t - arr[m]) <= d)
        return 0;
      else if (t <= arr[m])
        h = m - 1;
      else
        l = m + 1;
    }

    return 1;
  }
}