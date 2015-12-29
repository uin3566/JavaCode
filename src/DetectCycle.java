/**
 * Created by lenov0 on 2015/12/29.
 */
public class DetectCycle {
    /**
     * @param head: The first node of linked list.
     * @return: The node where the cycle begins.
     *           if there is no cycle, return null
     */
    public ListNode detectCycle(ListNode head) {
        // write your code here
        if(head == null || head.next == null){
            return null;
        }

        ListNode prev = head;
        ListNode cur = head;
        while(cur != null && cur.next != null){
            prev = prev.next;
            cur = cur.next.next;
            if(prev == cur){
                while(head != prev){
                    head = head.next;
                    prev = prev.next;
                }
                return prev;
            }
        }

        return null;
    }
}
