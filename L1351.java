public class L1351 {
  public int countNegatives(int[][] grid) {
    int nr = grid.length;
    int nc = grid[0].length;
    int r = nr - 1, c = 0;
    int count = 0;

    while (r >= 0 && c < nc) {
      if (grid[r][c] < 0) {
        --r;
        count += nc - c;
      } else {
        c++;
      }
    }

    return count;
  }
}
