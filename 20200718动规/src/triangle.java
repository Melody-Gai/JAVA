import java.util.ArrayList;

import static java.lang.Math.min;

public class triangle {
    public static void main(String[] args) {

    }

    public class Solution {
        public int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {
            int size = triangle.size();
            ArrayList<Integer> arr = triangle.get(size - 1);
            for(int i = size - 2; i >= 0; i--){
                for(int j = 0; j <= i; j++){
                    arr.set(j, min(arr.get(j), arr.get(j + 1)) + triangle.get(i).get(j));
                }
            }
            return arr.get(0);
        }
    }

}
