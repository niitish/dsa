import java.util.Comparator;
import java.util.PriorityQueue;

public class L1337 {
  // this will return count of 1s in the matrix row
  public int search(int[] ar) {
    int l = 0, h = ar.length - 1, m = 0;
    while (l <= h) {
      m = l + (h - l) / 2;
      if (ar[m] == 0)
        h = m - 1;
      else
        l = m + 1;
    }
    return l;
  }

  public int[] kWeakestRows(int[][] mat, int k) {
    PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
      @Override
      public int compare(int[] a, int[] b) {
        // [0]: no. of 1s, [1]: row index
        if (a[0] > b[0])
          return 1;
        else if (a[0] < b[0])
          return -1;
        else if (a[1] > b[1])
          return 1;
        else
          return -1;
      }
    });

    for (int i = 0; i < mat.length; i++) {
      int c = search(mat[i]);
      pq.add(new int[] { c, i });
    }

    int ans[] = new int[k];
    for (int i = 0; i < k; i++) {
      ans[i] = pq.poll()[1];
    }

    return ans;
  }
}
