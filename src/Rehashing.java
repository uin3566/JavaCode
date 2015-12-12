import java.util.ArrayList;

/**
 * Created by lenov0 on 2015/12/12.
 */
public class Rehashing {
    /**
     * @param hashTable: A list of The first node of linked list
     * @return: A list of The first node of linked list which have twice size
     */
    public ListNode[] rehashing(ListNode[] hashTable) {
        // write your code here
        if (hashTable == null || hashTable.length == 0){
            return null;
        }

        //获取散列表中所有的值
        ArrayList<Integer> numbers = getNumbers(hashTable);

        int reLength = hashTable.length * 2;
        ListNode[] reHashTable = new ListNode[reLength];

        putNumbers(reHashTable, numbers);

        return reHashTable;
    }

    public ArrayList<Integer> getNumbers(ListNode[] hashTable){
        ArrayList<Integer> numbers = new ArrayList<>();
        for (ListNode node : hashTable){
            while (node != null){
                numbers.add(node.val);
                node = node.next;
            }
        }
        return numbers;
    }

    public void putNumbers(ListNode[] hashTable, ArrayList<Integer> numbers){
        int capacity = hashTable.length;
        for (Integer num : numbers){
            ListNode nodeAdd = new ListNode(num);
            int index = (num % capacity + capacity) % capacity;
            if (hashTable[index] == null){
                hashTable[index] = nodeAdd;
            } else {
                ListNode node = hashTable[index];
                while (node.next != null){
                    node = node.next;
                }
                node.next = nodeAdd;
            }
        }
    }
}
