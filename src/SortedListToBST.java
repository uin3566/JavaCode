/**
 * Created by lenov0 on 2015/12/28.
 */
public class SortedListToBST {
    /**
     * @param head: The first node of linked list.
     * @return: a tree node
     */
    public TreeNode sortedListToBST(ListNode head) {
        // write your code here
        ListNode cur = head;
        int length = 0;
        while (cur != null){
            length++;
            cur = cur.next;
        }

        return sortedListToBST(head, length);
    }

    private TreeNode sortedListToBST(ListNode head, int length){
        if (length == 0){
            return null;
        }
        if (length == 1){
            return new TreeNode(head.val);
        }

        TreeNode root = new TreeNode(nthNode(head, length / 2 + 1).val);
        root.left = sortedListToBST(head, length / 2);
        root.right = sortedListToBST(nthNode(head, length / 2 + 2), (length - 1) / 2);

        return root;
    }

    private ListNode nthNode(ListNode head, int n){
        ListNode ret = head;
        for (int i = 0; i < n - 1; i++){
            ret = ret.next;
        }

        return ret;
    }
}
