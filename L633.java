public class L633 {
  public boolean judgeSquareSum(int c) {
    long l = 0, h = 65535;

    while (l <= h) {
      long p = l * l + h * h;
      if (p == c)
        return true;
      else if (p < c)
        l++;
      else
        h--;
    }

    return false;
  }
}
