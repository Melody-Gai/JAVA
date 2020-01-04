// 二叉树搜索树转换成排序双向链表。

public class TestDemo2 {
    TreeNode prev = null;
    public void ConvertChild(TreeNode pCur) {
        if(pCur == null) {
            return;
        }
        ConvertChild(pCur.left);
        pCur.left = prev;
        if(prev != null) {
            prev.right = pCur;
        }
        prev = pCur;
        ConvertChild(pCur.right);
    }

    //返回的是双向链表的头结点
    public TreeNode Convert(TreeNode pRootOfTree) {
        //这个函数，执行完成后，二叉搜索树的结构已经被改变了
        ConvertChild(pRootOfTree);
        TreeNode head = pRootOfTree;
        //一路向左
        while (head != null && head.left != null) {
            head = head.left;
        }
        return head;
    }
}
