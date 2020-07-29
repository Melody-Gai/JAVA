import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test5 {
    public static void main(String[] args) {
        //51. N皇后
    }
}
class Solution5 {
    boolean[] col = null;
    boolean[] left = null;
    boolean[] right = null;
    List<List<String>> ret = new ArrayList<>();

    public List<List<String>> solveNQueens(int n) {
        col = new boolean[n];
        left = new boolean[2*n-1];
        right = new boolean[2*n-1];
        char[][] board = new char[n][n];
        backTrack(board, 0, n);
        return ret;
    }

    void backTrack(char[][] board, int r, int n) {
        if (r >= n) {
            List<String> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                list.add(new String(board[i]));
            }
            ret.add(list);
            return;
        }
        Arrays.fill(board[r], '.');
        for (int i = 0; i < n; i++) {
            if (!col[i] && !left[r + i] && !right[r - i + n - 1]) {
                board[r][i] = 'Q';
                col[i] = true;
                left[r + i] = true;
                right[r - i + n - 1] = true;
                backTrack(board, r + 1, n);
                board[r][i] = '.';
                col[i] = false;
                left[r + i] = false;
                right[r - i + n - 1] = false;
            }
        }
    }
}