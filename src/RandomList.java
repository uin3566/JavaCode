/**
 * Created by lenov0 on 2015/12/13.
 */
public class RandomList {
    /**
     * @param head: The head of linked list with a random pointer.
     * @return: A new head of a deep copy of the list.
     */
    public RandomListNode copyRandomList(RandomListNode head) {
        // write your code here
        RandomListNode copyHead = null;

        RandomListNode node = head;
        while (node != null){
            RandomListNode copyNode = new RandomListNode(node.label);
            copyNode.next = node.next;
            node.next = copyNode;
            node = node.next.next;
        }

        copyHead = head.next;
        node = head;
        while (node != null){
            RandomListNode copyNode = node.next;
            if (node.random != null){
                copyNode.random = node.random.next;
            }
            node = node.next.next;
        }

        node = head;
        while (node != null){
            RandomListNode copyNode = node.next;
            node.next = node.next.next;
            node = node.next;
            if (copyNode.next != null){
                copyNode.next = copyNode.next.next;
            }
        }

        return copyHead;
    }
}
