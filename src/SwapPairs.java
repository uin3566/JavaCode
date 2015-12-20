/**
 * Created by lenov0 on 2015/12/20.
 */
public class SwapPairs {
    /**
     * @param head a ListNode
     * @return a ListNode
     */
    public ListNode swapPairs(ListNode head) {
        // Write your code here
        if (head == null){
            return null;
        }

        ListNode myHead = new ListNode(0);
        myHead.next = head;

        ListNode prev, mid, later;
        prev = myHead;
        mid = head;
        later = head.next;
        while (true){
            if (later != null){
                prev.next = later;
                mid.next = later.next;
                later.next = mid;
                prev = prev.next.next;
                mid = prev.next;
                if (mid != null){
                    later = mid.next;
                } else {
                    later = null;
                }
            } else {
                break;
            }
        }

        return myHead.next;
    }
}
