/**
 * Created by lenov0 on 2016/1/1.
 */
public class ReorderList {
    /**
     * @param head: The head of linked list.
     * @return: void
     */
    public void reorderList(ListNode head) {
        // write your code here
        if (head == null) {
            return;
        }

        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode tmp = slow.next;
        slow.next = null;
        slow = tmp;

        // revert slow list
        ListNode H = new ListNode(Integer.MIN_VALUE);
        while (slow != null) {
            tmp = slow.next;
            slow.next = H.next;
            H.next = slow;
            slow = tmp;
        }
        slow = H.next;
        H.next = null;

        // merge two list
        ListNode cur1 = head;
        ListNode cur2 = slow;
        while (cur1 != null && cur2 != null) {
            tmp = cur2.next;
            cur2.next = cur1.next;
            cur1.next = cur2;
            cur2 = tmp;
            cur1 = cur1.next.next;
        }
    }
}
