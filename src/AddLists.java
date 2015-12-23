/**
 * Created by Administrator on 2015/12/23.
 */
public class AddLists {
    /**
     * @param l1: the first list
     * @param l2: the second list
     * @return: the sum list of l1 and l2
     */
    public ListNode addLists(ListNode l1, ListNode l2) {
        // write your code here
        if (l1 == null && l2 == null){
            return null;
        }

        ListNode head = new ListNode(Integer.MIN_VALUE);
        ListNode cur = head;
        int extra = 0;
        while (l1 != null || l2 != null){
            if (l1 != null && l2 != null){
                int val = l1.val + l2.val + extra;
                extra = val / 10;
                ListNode node = new ListNode(val % 10);
                cur.next = node;
                cur = node;
                l1 = l1.next;
                l2 = l2.next;
            } else if (l1 != null){
                while (l1 != null){
                    int val = l1.val + extra;
                    extra = val / 10;
                    ListNode node = new ListNode(val % 10);
                    cur.next = node;
                    cur = node;
                    l1 = l1.next;
                }
            } else {
                while (l2 != null){
                    int val = l2.val + extra;
                    extra = val / 10;
                    ListNode node = new ListNode(val % 10);
                    cur.next = node;
                    cur = node;
                    l2 = l2.next;
                }
            }
        }

        if (extra != 0){
            cur.next = new ListNode(extra);
        }

        ListNode ret = head.next;
        head.next = null;
        return ret;
    }
}
