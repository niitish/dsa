public class L374 {
  public int guessNumber(int n) {
    long f = 1, l = n;

    while (f <= l) {
      int m = (int) (f + (l - f) / 2);
      int g = guess(m);
      if (g == -1) {
        l = m - 1;
      } else if (g == 1) {
        f = m + 1;
      } else
        return (int) m;
    }

    return -1;
  }
}