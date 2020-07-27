public class unique_paths {
    public static void main(String[] args) {

    }
    public class Solution {
        public int uniquePaths(int m, int n) {
            int[] count = new int[n];
            for(int i = 0; i < m; i++){
                for(int j = 0; j < n; j++){
                    if(i == 0 || j == 0)
                        count[j] = 1;
                    else
                        count[j] = count[j - 1] + count[j];
                }
            }
            return count[n - 1];
        }
    }
}
