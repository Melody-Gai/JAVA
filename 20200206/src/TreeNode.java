import java.util.LinkedList;
import java.util.List;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {
    List<Integer> list =new LinkedList<>();
    public void rightSideView1(TreeNode root, int level) {
        if(root==null) return ;
        if(level>list.size()){
            list.add(root.val);
        }
        rightSideView1(root.right,level+1);
        rightSideView1(root.left,level+1);
    }
    public List<Integer> rightSideView(TreeNode root) {
        rightSideView1(root,1);
        return list;
    }
}
