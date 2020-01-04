import java.util.*;
// 给定一个二叉树, 找到该树中两个指定节点的最近公共祖先 。

public class TestDemo1 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if(root == null) {
            return null;
        }
        if(root == p || root == q) {
            return root;
        }
        TreeNode leftTree = lowestCommonAncestor(root.left,p,q);
        TreeNode rightTree = lowestCommonAncestor(root.right,p,q);
        if(leftTree != null && rightTree != null) {
            return root;
        }
        if(leftTree != null) {
            return leftTree;
        }
        if(rightTree != null) {
            return rightTree;
        }
        return null;
    }

}
