public class L367 {
  boolean isPerfectSquare(int num) {
    if (num <= 1)
      return true;

    long l = 0, h = num;
    while (l < h) {
      long m = l + (h - l) / 2;
      long p = m * m;
      if (p < num)
        l = m + 1;
      else if (p > num)
        h = m;
      else
        return true;
    }

    return false;
  }
}
