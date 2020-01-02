import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestDemo2 {

    //杨辉三角形

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        if(numRows == 0) {
            return triangle;
        }
        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);

        for(int i = 1;i < numRows;i++) {
            List<Integer> curRow = new ArrayList<>();
            curRow.add(1);
            List<Integer> prevRow = triangle.get(i - 1);
            for(int j = 1;j < i;j++) {
                int tmp = prevRow.get(j - 1) + prevRow.get(j);
                curRow.add(tmp);
            }
            curRow.add(1);
            triangle.add(curRow);
        }
        return triangle;
    }

    public static void main(String[] args) {
        List<List<Integer>> ret = generate(5);
        for (List<Integer> list:ret) {
            System.out.println(list);
        }
    }
}
