/**
 * Created by Administrator on 2015/12/23.
 */
public class DeleteDuplicates {
    /**
     * @param ListNode head is the head of the linked list
     * @return: ListNode head of linked list
     */
    public static ListNode deleteDuplicates(ListNode head) {
        // write your code here
        if (head == null || head.next == null){
            return head;
        }

        ListNode prev = head;
        ListNode later = head.next;
        while (later != null){
            if (prev.val == later.val){
                prev.next = later.next;
                later.next = null;
                later = prev.next;
            } else {
                prev = prev.next;
                later = later.next;
            }
        }

        return head;
    }
}
