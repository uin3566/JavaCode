import java.util.List;

/**
 * Created by Administrator on 2015/12/21.
 */
public class IsPalindrome {
    /**
     * @param head a ListNode
     * @return a boolean
     */
    public boolean isPalindrome(ListNode head) {
        // Write your code here
        if (head == null || head.next == null){
            return true;
        }

        boolean isPalind = true;

        ListNode fastNode = head;
        ListNode slowNode = head;
        while (fastNode.next != null && fastNode.next.next != null){
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
        }

        ListNode prev = slowNode.next;
        ListNode later = prev.next;
        prev.next = null;
        while (later != null){
            ListNode tmp = later.next;
            later.next = prev;
            prev = later;
            later = tmp;
        }

        ListNode h = head;
        ListNode t = prev;
        while (t != null) {
            if (h.val == t.val) {
                isPalind = true;
            } else {
                isPalind = false;
                break;
            }
            h = h.next;
            t = t.next;
        }

        later = prev.next;
        prev.next = null;
        while (later != null){
            ListNode tmp = later.next;
            later.next = prev;
            prev = later;
            later = tmp;
        }
        slowNode.next = prev;

        return isPalind;
    }
}
