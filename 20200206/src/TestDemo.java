import javax.swing.tree.TreeNode;
import java.util.*;

class Solution9 {
    public boolean isMatch(String s, String p) {
        boolean[][] value = new boolean[p.length()+1][s.length()+1];
        value[0][0] = true;
        for(int i = 1;i <= s.length();i++){
            value[0][i] = false;
        }
        for(int i = 1;i <= p.length(); i++){
            if(p.charAt(i-1) == '*'){
                value[i][0] = value[i-1][0];
                for(int j = 1;j <= s.length(); j++){
                    value[i][j] = (value[i][j-1] || value[i-1][j]);
                }
            }else if(p.charAt(i-1) == '?'){
                value[i][0] = false;
                for(int j = 1;j <= s.length(); j++){
                    value[i][j] = value[i-1][j-1];
                }
            }else {
                value[i][0] = false;
                for(int j = 1;j <= s.length(); j++){
                    value[i][j] = s.charAt(j-1) == p.charAt(i-1) && value[i-1][j-1];
                }
            }

        }
        return value[p.length()][s.length()];

    }
}

class Solution8 {
    public int numBusesToDestination(int[][] routes, int S, int T) {
        if(S == T) return 0;
        Map<Integer, Set<Integer>> graph = new HashMap<>();
        for(int i = 0; i < routes.length; i++){
            for(int station : routes[i]){
                Set<Integer> set = graph.getOrDefault(station, new HashSet<>());
                set.add(i);
                graph.put(station, set);
            }
        }
        Set<Integer> line = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        for(int l : graph.get(S)){
            queue.add(l);
            line.add(l);
        }
        int takeBus = 1;
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0; i < size; i++){
                int curline = queue.poll();
                for(int sta : routes[curline]){
                    if(sta == T) return takeBus;
                    if(graph.containsKey(sta)){
                        for(int next : graph.get(sta)){
                            if(!line.contains(next)){
                                queue.add(next);
                                line.add(next);
                            }
                        }
                    }
                }
            }
            takeBus++;
        }
        return -1;
    }
}

class Solution7 {

    private int row;

    private int col;

    private int[][] position = new int[][]{{-1, 0}, {0, 1}, {1, 0}, {0, -1}};

    private int[][] memo;

    public int longestIncreasingPath(int[][] matrix) {
        if (null == matrix || matrix.length < 1) {
            return 0;
        }
        row = matrix.length;
        col = matrix[0].length;
        memo = new int[row][col];
        int res = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                res = Math.max(res, dfs(matrix, i, j));
            }
        }
        return res;
    }

    private int dfs(int[][] matrix, int i, int j) {
        // 查缓存，如果缓存中有直接return
        if (memo[i][j] != 0) {
            return memo[i][j];
        }
        int max = 0;
        for (int[] pos : position) {
            int x = i + pos[0];
            int y = j + pos[1];
            if (verify(x, y) && matrix[x][y] > matrix[i][j]) {
                max = Math.max(max, dfs(matrix, x, y));
            }
        }
        // 缓存结果
        memo[i][j] = 1 + max;
        return 1 + max;
    }

    // 检查数组角标越界
    private boolean verify(int i, int j) {
        return i >= 0 && i < row && j >= 0 && j < col;
    }
}

class Solution6 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        for (int i = 0; i < nums.length; i++) {
            int all = res.size();
            for (int j = 0; j < all; j++) {
                List<Integer> tmp = new ArrayList<>(res.get(j));
                tmp.add(nums[i]);
                res.add(tmp);
            }
        }
        return res;
    }
}


class Solution5 {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String s : tokens) {
            switch (s) {
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-":
                    stack.push(- stack.pop() + stack.pop());
                    break;
                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;
                case "/":
                    Integer second = stack.pop();
                    Integer first = stack.pop();
                    stack.push(first / second);
                    break;
                default:
                    stack.push(Integer.valueOf(s));
                    break;
            }
        }
        return stack.pop();
    }
}


class Solution4 {
    public int findUnsortedSubarray(int[] nums) {
        //先备份，再排序
        //正向寻找第一个不同的数字，再反向找第一个不同的数字
        int[] nums_copy=nums.clone();
        Arrays.sort(nums_copy);
        int i=0,j=0;
        for(int m=0;m<nums.length;m++)
        {
            if(nums_copy[m]!=nums[m])
            {
                i=m;
                break;
            }
        }
        for(int m=nums.length-1;m>=0;m--)
        {
            if(nums_copy[m]!=nums[m])
            {
                j=m;
                break;
            }
        }
        if(i==0 && j==0)
            return 0;

        return j-i+1;
    }
}

class Solution3 {
    public int compress(char[] chars) {

        int j = 0;  // 表示新数组的指示器
        for(int i=0; i<chars.length; i++){
            char ch = chars[i];
            int count = 1;
            while(i+1<chars.length && chars[i+1] == ch){
                count++;
                i++;
            }
            chars[j++] = ch;
            if(count > 1){
                // 表示有多个元素
                String num = count +"";
                for(int k=0; k<num.length(); k++){
                    chars[j++] = num.charAt(k);
                }
            }
        }
        return j;
    }
}

class Solution2 {
    public boolean isPalindrome(String s) {
        if (s == null) return true;
        s = s.toLowerCase();
        int l = s.length();
        StringBuilder str = new StringBuilder(l);
        for (char c : s.toCharArray()) {
            if ((c >= '0' && c <= '9') || (c >= 'a' && c <= 'z')) {
                str.append(c);
            }
        }
        return str.toString().equals(str.reverse().toString());
    }
}

class Solution1 {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        int flg = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == target) {
                res[0] = i;
                flg = 1;
                break;
            }
        }
        if(flg == 0) {
            res[0] = -1;
        }

        for(int j = res[0] + 1;  j < nums.length;j++) {
            if(nums[j] == target) {
                res[1] = j;
                flg = 2;
                break;
            }
        }
        if(flg == 0) {
            res[1] = -1;
        }

        if(flg == 0 && res[0] + 1 >nums.length - 1) {
            res[0] = -1;
            res[1] = -1;
        }
        return res;
    }
}

public class TestDemo {
}
