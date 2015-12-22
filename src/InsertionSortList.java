/**
 * Created by lenov0 on 2015/12/22.
 */
public class InsertionSortList {
    /**
     * @param head: The first node of linked list.
     * @return: The head of linked list.
     */
    public ListNode insertionSortList(ListNode head) {
        // write your code here
        if (head == null || head.next == null){
            return head;
        }

        //             head  ->  n2  ->  n3->  n4->...
        //                     ocur(n2)，开始比较，插入
        //newHead  ->  head  ->  n2  ->n3  ->n4  ->...
        //  prev       cur
        ListNode newHead = new ListNode(Integer.MIN_VALUE);
        newHead.next = new ListNode(head.val);

        ListNode ocur = head.next;
        ListNode prev = newHead;
        ListNode cur = prev.next;

        while (ocur != null){
            while (cur != null && ocur.val > cur.val){
                prev = cur;
                cur = cur.next;
            }
            ListNode node = new ListNode(ocur.val);
            if (cur == null){
                prev.next = node;
            } else if (ocur.val <= cur.val){
                prev.next = node;
                node.next = cur;
            }
            ocur = ocur.next;
            prev = newHead;
            cur = prev.next;
        }

        ListNode ret = newHead.next;
        newHead.next = null;
        return ret;
    }
}
