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
        public static void testMaxPoints(){
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

        public static void testLengthOfLongestSubstring(){
            LengthOfLongestSubstring l = new LengthOfLongestSubstring();
            int num = l.lengthOfLongestSubstring("gehmbfqmozbpripibusbezagafqtypz");
            System.out.println("lengthOfLongestSubstring:" + num);
        }

        public static void testLengthOfLongestSubstringKDistinct(){
            LengthOfLongestSubstringKDistinct l = new LengthOfLongestSubstringKDistinct();
            int num = l.lengthOfLongestSubstringKDistinct("eqgkcwGFvjjmxutystqdfhuMblWbylgjxsxgnoh", 16);
            System.out.println("lengthOfLongestSubstring:" + num);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Test.testLengthOfLongestSubstringKDistinct();
    }
}
