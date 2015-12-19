import java.util.List;

/**
 * Created by lenov0 on 2015/12/19.
 */
public class RemoveElements {
    /**
     * @param head a ListNode
     * @param val an integer
     * @return a ListNode
     */
    public ListNode removeElements(ListNode head, int val) {
        // Write your code here
        ListNode myHead = new ListNode(val - 1);
        myHead.next = head;
        ListNode prev = myHead;
        ListNode cur = head;
        while (cur != null){
            if (cur.val == val){
                prev.next = cur.next;
                cur.next = null;
                cur = prev.next;
            } else {
                prev = prev.next;
                cur = cur.next;
            }
        }

        return myHead.next;
    }
}
