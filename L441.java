public class L441 {
  public int arrangeCoins(int n) {
    long l = 1, h = 65535;

    while (l <= h) {
      long m = l + (h - l) / 2;
      long p = m * (m + 1) / 2;
      if (p == n) {
        return (int) m;
      } else if (p < n) {
        l = m + 1;
      } else {
        h = m + 1;
      }
    }

    return (int) h;
  }
}
