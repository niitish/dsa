public class L1539 {
  public int findKthPositive(int[] arr, int k) {
    int l = 0, h = arr.length, m;

    while (l < h) {
      m = l + (h - l) / 2;
      if (arr[m] - 1 - m < k)
        l = m + 1;
      else
        h = m;
    }

    return l + k;
  }
}
