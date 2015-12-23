/**
 * Created by Administrator on 2015/12/23.
 */
public class NthToLast {
    /**
     * @param head: The first node of linked list.
     * @param n: An integer.
     * @return: Nth to last node of a singly linked list.
     */
    ListNode nthToLast(ListNode head, int n) {
        // write your code here
        int length = 0;
        ListNode cur = head;
        while (cur != null){
            length++;
            cur = cur.next;
        }

        ListNode ret = head;
        int nn = length - n + 1;
        for (int i = 0; i < nn - 1; i++){
            ret = ret.next;
        }

        return ret;
    }
}
