public class L1608 {
  public int specialArray(int[] nums) {
    int count[] = new int[1001];

    for (int i = 0; i <= 1000; i++)
      for (int j : nums)
        if (j >= i)
          ++count[i];

    for (int i = 0; i <= 1000; i++) {
      if (count[i] == i)
        return i;
    }

    return -1;
  }
}
