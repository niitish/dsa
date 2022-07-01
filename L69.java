public class L69 {
  public int mySqrt(int x) {
    if (x == 1)
      return 1;

    int l = 1, h = x / 2;
    int ans = 0;
    while (l <= h) {
      int m = l + (h - l) / 2;

      if (m <= x / m) {
        ans = m;
        l = m + 1;
      } else
        h = m - 1;
    }
    return ans;
  }
}
