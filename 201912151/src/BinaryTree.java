import sun.reflect.generics.tree.Tree;

import java.util.*;

class TreeNode {
    char value;
    TreeNode left;
    TreeNode right;
    public TreeNode(char value) {
        this.value = value;
    }
}
public class BinaryTree {

    public BinaryTree() {
    }
    public TreeNode buildTree() {
        TreeNode root = new TreeNode('A');
        TreeNode B = new TreeNode('B');
        TreeNode C = new TreeNode('C');
        TreeNode D = new TreeNode('D');
        TreeNode E = new TreeNode('E');
        TreeNode F = new TreeNode('F');
        TreeNode G = new TreeNode('G');
        TreeNode H = new TreeNode('H');
        root.left = B;
        root.right = C;
        B.left = D;
        B.right = E;
        E.right = H;
        C.left = F;
        C.right = G;
        return root;
    }

    // 前序遍历
    void preOrderTraversal(TreeNode root){
        if(root == null) {
            return;
        }
        System.out.print(root.value+" ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    // 中序遍历
    void inOrderTraversal(TreeNode root){
        if(root == null) {
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(root.value+" ");
        inOrderTraversal(root.right);
    }

    // 后序遍历
    void postOrderTraversal(TreeNode root){
        if(root == null) {
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.value+" ");
    }
    class Solution {
        public List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> list = new ArrayList<>();
            if(root == null) {
                return list;
            }
            List<Integer> list1 = inOrderTraversal(root.left);
            list.addAll(list1);
            System.out.print(root.value + " ");
            list.add(root.value);
            List<Integer> list2 = inOrderTraversal(root.right);
            list.addAll(list2);
            return list;
        }
    }

    int getLeafSize2(TreeNode root) {
        if(root == null) {
            return 0;
        }else if(root.left == null && root.right == null){
            return 1;
        }
        return (getLeafSize2(root.left) + getLeafSize2(root.right));
    }
     int getKlevelSize(TreeNode root,int k) {
        if(root == null) {
            return 0;
        }
        if(k == 1) {
            return 1;
        }
        /*else if(root.left != null || root.right != null) {
            k--;
            return 1;
        }*/
        return getKlevelSize(root.left,k-1) + getKlevelSize(root.right,k-1);
     }
     TreeNode find(TreeNode root,int val) {
        if(root == null) {
            return null;
        }
        if(root.value == val) {
            return root;
        }
        TreeNode ret = find(root.left,val);
        if(ret != null) {
            return ret;
        }

        ret = find(root.right,val);
        if (root.value == val) {
            return ret;
        }
        return null;
     }
     public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q != null || p != null && q == null) {
            return false;
        }
        if(p == null && q == null) {
            return true;
        }
        if(p.value != q.value) {
            return false;
        }
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
     }
     public boolean isSubtree(TreeNode s,TreeNode t) {
         if(s == null || t == null) {
             return false;
         }
         if(isSameTree(s,t)) {
             return true;
         }
         if(isSubtree(s.left,t)) {
             return true;
         }
         if(isSubtree(s.right,t)) {
             return true;
         }
         return false;
     }
}





















