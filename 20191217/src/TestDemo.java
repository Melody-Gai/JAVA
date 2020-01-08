import javax.swing.tree.TreeNode;
import java.util.*;


public class TestDemo {
    class Solution {
        public int maxDepth(TreeNode root) {
            if(root == null) {
                return 0;
            }
            int leftHight = maxDepth(root.left);
            int rightHight = maxDepth(root.right);

            return leftHight > rightHight
                    ? leftHight + 1 : rightHight + 1;

        }
    }

    public boolean isSymmetricChiled(TreeNode leftTree,TreeNode rightTree) {

    }
    public boolean isSymmetric(TreeNode root) {
        if(root == null) {
            return false;
        }
        return isSymmetricChiled(root.left,root.right);
    }

    class Solution {
        public List<Integer> preorderTraversal(TreeNode root) {

        }
    }

    List<Character> inOrderTraversal(TreeNode root) {
        List<Character> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while(cur != null || !stack.empty()) {
            while(cur != null) {
                stack.push(cur.left);


                cur = cur.left;
            }
            cur = stack.pop();
            list.add(cur.value);
            cur = cur.right;
        }
        return list;
    }

    void levelOrderTraversal(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        if (root != null) {
            queue.offer(root);
        }
        while (!queue.isEmpty()) {
            TreeNode cur = queue.poll();
            System.out.println(cur.value + "");
            if (cur.left != null) {
                queue.offer(cur.left);
            }
        }

    }

}























