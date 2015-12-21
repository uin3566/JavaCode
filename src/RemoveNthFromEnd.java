/**
 * Created by lenov0 on 2015/12/21.
 */
public class RemoveNthFromEnd {
    /**
     * @param head: The first node of linked list.
     * @param n: An integer.
     * @return: The head of linked list.
     */
    ListNode removeNthFromEnd(ListNode head, int n) {
        // write your code here
        int length = 0;
        ListNode cur = head;
        while (cur != null){
            length++;
            cur = cur.next;
        }

        int nThFromStart = length - n + 1;
        cur = head;
        if (nThFromStart == 1){
            head = head.next;
            cur.next = null;
        }else {
            for (int i = 0; i < nThFromStart - 2; i++){
                cur = cur.next;
            }
            ListNode nodeToDel = cur.next;
            cur.next = nodeToDel.next;
            nodeToDel.next = null;
        }

        return head;
    }
}
