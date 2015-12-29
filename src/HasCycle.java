/**
 * Created by lenov0 on 2015/12/29.
 */
public class HasCycle {
    /**
     * @param head: The first node of linked list.
     * @return: True if it has a cycle, or false
     */
    public boolean hasCycle(ListNode head) {
        // write your code here
        if(head == null || head.next == null){
            return false;
        }

        ListNode pre = head;
        ListNode cur = head;
        while(cur != null && cur.next != null){
            pre = pre.next;
            cur = cur.next.next;
            if(pre == cur){
                return true;
            }
        }

        return false;
    }
}
