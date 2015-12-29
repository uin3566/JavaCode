import java.util.List;

/**
 * Created by lenov0 on 2015/12/29.
 */
public class MergeKLists {
    /**
     * @param lists: a list of ListNode
     * @return: The head of one sorted list.
     */
    public ListNode mergeKLists(List<ListNode> lists) {
        // write your code here
        if (lists.size() == 0){
            return null;
        }
        if (lists.size() == 1){
            return lists.get(0);
        }

        ListNode head = new ListNode(Integer.MIN_VALUE);
        head.next = lists.get(0);
        for (int i = 1; i < lists.size(); i++){
            ListNode cmpHd = lists.get(i);
            while (cmpHd != null){
                ListNode cur = head;
                while (cur.next != null && cmpHd.val > cur.next.val){
                    cur = cur.next;
                }
                ListNode tmp = cmpHd.next;
                cmpHd.next = cur.next;
                cur.next = cmpHd;
                cmpHd = tmp;
            }
        }

        return head.next;
    }
}
