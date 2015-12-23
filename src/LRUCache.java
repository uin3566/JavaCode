import java.util.HashMap;

/**
 * Created by lenov0 on 2015/12/23.
 */
public class LRUCache {

    private int mCapacity;
    private HashMap<Integer, Integer> mCache = new HashMap<>();
    private ListNode head = new ListNode(Integer.MIN_VALUE);
    private ListNode tail = head;

    // @param capacity, an integer
    public LRUCache(int capacity) {
        // write your code here
        mCapacity = capacity;
    }

    // @return an integer
    public int get(int key) {
        // write your code here
        if (!mCache.containsKey(key)){
            return -1;
        }

        updateList(key);

        return mCache.get(key);
    }

    // @param key, an integer
    // @param value, an integer
    // @return nothing
    public void set(int key, int value) {
        // write your code here
        if (mCache.containsKey(key)){
            mCache.put(key, value);
            updateList(key);
            return;
        }
        ListNode node = new ListNode(key);
        if (mCache.size() == mCapacity){
            ListNode del = head.next;
            mCache.remove(del.val);
            if (del == tail){
                tail = head;
            }
            head.next = del.next;
            del.next = null;
        }
        mCache.put(key, value);
        tail.next = node;
        tail = node;
    }

    private void updateList(int key){
        ListNode cur = head;
        while (cur.next.val != key){
            cur = cur.next;
        }
        ListNode keyNode = cur.next;
        if (keyNode != tail){
            cur.next = cur.next.next;
            tail.next = keyNode;
            keyNode.next = null;
            tail = keyNode;
        }
    }
}
