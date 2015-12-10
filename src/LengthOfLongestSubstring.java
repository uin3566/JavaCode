import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2015/12/10.
 */
public class LengthOfLongestSubstring {
    /**
     * @param s: a string
     * @return: an integer
     */
    public int lengthOfLongestSubstring(String s) {
        // write your code here
        Map<Character, Integer> charMap = new HashMap<>();
        int longestLength = charMap.size();

        if (s == null){
            return 0;
        }

        int curSize = 0;
        int fromIndex = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (charMap.containsKey(ch)) {
                int curIndex = s.indexOf(ch, fromIndex);
                for (int k = fromIndex; k <= curIndex; k++){
                    charMap.remove(s.charAt(k));
                }
                fromIndex = curIndex + 1;
                charMap.put(ch, 1);
            } else {
                charMap.put(ch, 1);
                curSize = charMap.size();
            }
            if (curSize > longestLength){
                longestLength = curSize;
            }
        }

        return longestLength;
    }
}
