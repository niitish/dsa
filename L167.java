public class L167 {
  public int[] twoSum(int[] numbers, int target) {
    int f = 0, l = numbers.length - 1;

    while (f < l) {
      if (numbers[f] + numbers[l] < target) {
        ++f;
      } else if (numbers[f] + numbers[l] > target) {
        --l;
      } else {
        return new int[] { f + 1, l + 1 };
      }
    }
    return new int[] { -1, -1 };
  }
}