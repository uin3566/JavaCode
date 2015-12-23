/**
 * Created by lenov0 on 2015/12/23.
 */
public class DeleteDuplicates2 {
    /**
     * @param ListNode head is the head of the linked list
     * @return: ListNode head of the linked list
     */
    public static ListNode deleteDuplicates(ListNode head) {
        // write your code here
        ListNode myHead = new ListNode(Integer.MIN_VALUE);
        myHead.next = head;
        ListNode prev = myHead;
        while (head != null){
            if (head.next != null && head.val == head.next.val){
                int duplicate = head.val;
                while (head.next != null && head.next.val == duplicate){
                    head = head.next;
                }
                prev.next = head.next;
                head.next = null;
                head = prev.next;
            } else {
                head = head.next;
                prev = prev.next;
            }
        }

        ListNode ret = myHead.next;
        myHead.next = null;
        return ret;
    }
}
