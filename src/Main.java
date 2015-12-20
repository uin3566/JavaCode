import java.util.ArrayList;
import java.util.Arrays;
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

        public static void MajorityNumber(){
            MajorityNumber m = new MajorityNumber();
            Integer[] array = new Integer[]{14,73,150,44,226,62,111,194,100,178,177,37,100,57,57,75,108,56,106,243,74,43,195,46,255,117,100,214,67,247,197,123,213,252,139,101,100,258,114,18,54,100,79,14,248,182,100,222,257,208,131,233,239,24,159, 125, 214, 74, 137,18,131,47,100,100,81,100,100,200,100,149,260,140,148,228,76,95,258,157,98,199,133,230,18,218,156,126,187,89,22,63,13,151,94,216,99,240,225,195,186,112,59,40,92,213,159,142,147,99,48,80,188,207,93,66,100,81,238,51,151,177,17,66,207,156,248,178,261,136,100,99,100,70,217,228,35,55,168,188,266,39,36,207,71,100,44,111,202,14,100,16,193,100,100,84,92,167,100,124,15,230,93,147,206,115,100,127,89,100,235,160,45,93,157,106,100,113,196,60,39,135,206,189,189,191,36,12,62,247,76,137,113,221,45,188,265,206,206,120,208,79,125,115,182,112,86,229,125,241,125,166,19,210,66,136,104,125,115,237,251,267,213,245,79,100,11,64,155,142,10,191,235,195,232,208,60,212,244,34,189,37,17,11,231,91,163,126,242,224,124,180,206,236,199,197,147,15,80,116,198,94,185,158,171,53,256,32,164};
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (Integer num : array){
                arrayList.add(num);
            }
            m.majorityNumber(arrayList, 13);
        }

        public static void MinWindow(){
            MinWindow m = new MinWindow();
            m.minWindow("abc", "a");
        }

        public static void RemoveElements(){
            RemoveElements r = new RemoveElements();
            ListNode node1 = new ListNode(1);
            ListNode node2 = new ListNode(1);
            node1.next = node2;
            node2.next = null;
            r.removeElements(node1, 1);
        }

        public static void SwapPairs(){
            SwapPairs s = new SwapPairs();
            ListNode n1 = new ListNode(1);
            ListNode n2 = new ListNode(2);
            ListNode n3 = new ListNode(3);
            ListNode n4 = new ListNode(4);
            n1.next = n2;
            n2.next = n3;
            n3.next = n4;
            n4.next = null;
            s.swapPairs(n1);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Test.SwapPairs();
    }
}
