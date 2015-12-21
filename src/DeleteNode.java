/**
 * Created by lenov0 on 2015/12/21.
 */
public class DeleteNode {
    /**
     * @param node: the node in the list should be deleted
     * @return: nothing
     */
    public void deleteNode(ListNode node) {
        // write your code here
        if (node == null || node.next == null){
            return;
        }

        ListNode nodeToDel = node.next;
        node.val = nodeToDel.val;
        node.next = nodeToDel.next;
        nodeToDel.next = null;
    }
}
