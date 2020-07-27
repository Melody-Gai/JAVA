import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Test4 {
    public static void main(String[] args) {
        //力扣429. N叉树的层序遍历
    }
    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    };
    class Solution {
        public List<List<Integer>> levelOrder(Node root) {
            Queue<Node> queue = new LinkedList<>();
            List<List<Integer>> res = new ArrayList<>();
            if (root != null) {
                queue.add(root);
            }
            while (!queue.isEmpty()) {
                List<Integer> temp = new ArrayList<>();
                for (int i = queue.size(); i > 0; i--) {
                    Node node = queue.poll();
                    if (node != null) {
                        temp.add(node.val);
                        queue.addAll(node.children);
                    }
                }
                res.add(temp);
            }
            return res;
        }
    }
}
