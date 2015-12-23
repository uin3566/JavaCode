/**
 * Created by Administrator on 2015/12/23.
 */
public class MergeTwoLists {
    /**
     * @param ListNode l1 is the head of the linked list
     * @param ListNode l2 is the head of the linked list
     * @return: ListNode head of linked list
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // write your code here
        ListNode head = new ListNode(Integer.MIN_VALUE);
        head.next = l1;
        ListNode prev = head;
        ListNode later = prev.next;
        ListNode cur = l2;

        while (cur != null){
            while (later != null && cur.val > later.val){
                prev = prev.next;
                later = later.next;
            }
            if (later == null){
                ListNode tmp = cur.next;
                cur.next = null;
                prev.next = cur;
                cur = tmp;
            } else {
                ListNode tmp = cur.next;
                prev.next = cur;
                cur.next = later;
                cur = tmp;
            }
            prev = head;
            later = prev.next;
        }

        return head.next;
    }
}
