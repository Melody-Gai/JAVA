import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Test1 {
    public static void main(String[] args) {
//752. 打开转盘锁
    }
}
class Solution {
    //标准BFS  --> 可以抽象成⼀幅图，每个节点有 8 个相邻的节点(四位改变，每位两种改变状态)，求最短距离。
    public int openLock(String[] deadends, String target) {
        Set<String> deadSet = new HashSet<>();
        Set<String>visited = new HashSet<>();           // 记录访问过的节点，避免重复入队重复搜索
        Queue<String> queue = new LinkedList<>();        // bfs核心工具
        for(String str:deadends) deadSet.add(str);      // 记录死亡数字
        int step=0;
        queue.offer("0000");
        visited.add("0000");
        while(!queue.isEmpty()){
            int size=queue.size();
            for(int i=0;i<size;i++){
                String cur=queue.poll();
                if(deadSet.contains(cur)) continue;    // 遇到死亡数字，不再以此为起点往外扩散，即可以理解为dfs的“剪枝”
                if(cur.equals(target)) return step;    // 到达终点，终止搜索

                for(int j=0;j<4;j++) {                  //向四周扩散
                    String up=plusOne(cur,j);
                    if(!visited.contains(up)){          //访问过的节点不再入队进行BFS，避免重复搜索
                        queue.offer(up);
                        visited.add(up);
                    }
                    String down=minusOne(cur,j);
                    if(!visited.contains(down)){
                        queue.offer(down);
                        visited.add(down);
                    }
                }
            }
            step++;
        }
        return -1;                                  //穷举完也没有找到目标值，说明目标值有问题。返回-1
    }
    private String plusOne(String s, int j) {
        char[] ch = s.toCharArray();
        if (ch[j] == '9') ch[j] = '0';
        else ch[j] += 1;
        return new String(ch);
    }
    private String minusOne(String s, int j) {
        char[] ch = s.toCharArray();
        if (ch[j] == '0') ch[j] = '9';
        else ch[j] -= 1;
        return new String(ch);
    }

}
