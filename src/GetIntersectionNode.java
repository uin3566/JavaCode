/**
 * Created by lenov0 on 2015/12/21.
 */
public class GetIntersectionNode {
    /**
     * @param headA: the first list
     * @param headB: the second list
     * @return: a ListNode
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // Write your code here
        if (headA == null || headB == null){
            return null;
        }

        int lengthA = 0;
        int lengthB = 0;
        ListNode curA = headA;
        ListNode curB = headB;
        while (curA != null || curB != null){
            if (curA != null){
                lengthA++;
                curA = curA.next;
            }
            if (curB != null){
                lengthB++;
                curB = curB.next;
            }
        }

        curA = headA;
        curB = headB;
        int diff = 0;
        if (lengthA < lengthB){
            diff = lengthB - lengthA;
            for (int i = 0; i < diff; i++){
                curB = curB.next;
            }
        } else if (lengthA > lengthB){
            diff = lengthA - lengthB;
            for (int i = 0; i < diff; i++){
                curA = curA.next;
            }
        }

        while (curA != null){
            if (curA == curB){
                return curA;
            }
            curA = curA.next;
            curB = curB.next;
        }

        return null;
    }
}
