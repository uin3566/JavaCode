/**
 * Created by Administrator on 2015/12/23.
 */
public class RotateRight {
    /**
     * @param head: the List
     * @param k: rotate to the right k places
     * @return: the list after rotation
     */
    public ListNode rotateRight(ListNode head, int k) {
        // write your code here
        int length = 0;
        ListNode cur = head;
        while (cur != null){
            length++;
            cur = cur.next;
        }
        if (length == 0){
            return null;
        }

        k = k % length;
        int rotatePos = length - k;
        cur = head;
        for (int i = 0; i < rotatePos - 1; i++){
            cur = cur.next;
        }
        ListNode newHead = cur.next;
        cur.next = null;
        if (newHead == null){
            return head;
        }
        ListNode node = newHead;
        while (node.next != null){
            node = node.next;
        }
        node.next = head;

        return newHead;
    }
}
