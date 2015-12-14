import java.util.ArrayList;
import java.util.List;

/**
 * @(#)Main.java
 *
 *
 * @author 
 * @version 1.00 2015/12/10
 */

public class Main {
        
    /**
     * Creates a new instance of <code>Main</code>.
     */
    public Main() {
    }

    private static class Test{
        public static void maxPoints(){
            //(1, 2), (3, 6), (0, 0), (1, 3)
            Point[] points = new Point[4];
            points[0] = new Point(1, 2);
            points[1] = new Point(3, 6);
            points[2] = new Point(0, 0);
            points[3] = new Point(1, 3);
            MaxPoints m = new MaxPoints();
            int num = m.maxPoints(points);
            System.out.println("max point count:" + num);
        }

        public static void lengthOfLongestSubstring(){
            LengthOfLongestSubstring l = new LengthOfLongestSubstring();
            int num = l.lengthOfLongestSubstring("gehmbfqmozbpripibusbezagafqtypz");
            System.out.println("lengthOfLongestSubstring:" + num);
        }

        public static void lengthOfLongestSubstringKDistinct(){
            LengthOfLongestSubstringKDistinct l = new LengthOfLongestSubstringKDistinct();
            int num = l.lengthOfLongestSubstringKDistinct("eqgkcwGFvjjmxutystqdfhuMblWbylgjxsxgnoh", 16);
            System.out.println("lengthOfLongestSubstring:" + num);
        }

        public static void anagrams(){
            Anagrams a = new Anagrams();
            String[] strs = new String[]{"lint","intl","inlt","code"};
            List<String> results = a.anagrams(strs);
            for (String str : results) {
                System.out.println(str);
            }
        }

        public static void isHappy(){
            IsHappy i = new IsHappy();
            int num = 19;
            boolean b = i.isHappy(num);
            System.out.println("num:" + num + ",isHappy? " + b);
        }

        public static void subarraySum(){
            SubarraySum s = new SubarraySum();
            int[] nums = new int[]{-3, 1, 2, -3, 4};
            ArrayList<Integer> list = s.subarraySum(nums);
            System.out.print(list.get(0) + " to " + list.get(1));
        }

        public static void reHashing(){
            Rehashing r = new Rehashing();
            ArrayList<Integer> numbers = new ArrayList<>();
            numbers.add(21);
            numbers.add(9);
            numbers.add(14);
            ListNode[] hashTable = new ListNode[4];
            r.putNumbers(hashTable, numbers);
            ListNode[] newTable = r.rehashing(hashTable);
        }

        public static void randomList(){
            RandomList r = new RandomList();
            RandomListNode node1 = new RandomListNode(1);
            RandomListNode node2 = new RandomListNode(2);
            RandomListNode node3 = new RandomListNode(3);
            node1.next = node2;
            node2.next = node3;
            node1.random = node3;
            node2.random = null;
            node3.random = node2;
            RandomListNode copyHead = r.copyRandomList(node1);
        }

        public static void fourSum(){
            FourSum f = new FourSum();
            f.fourSum(new int[]{1, 0, -1, -1, -1, -1, 0, 1, 1, 1, 2}, 2);
        }

        public static void twoSum(){
            TwoSum t = new TwoSum();
            t.twoSum(new int[]{2, 7, 11, 15}, 9);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Test.twoSum();
    }
}
