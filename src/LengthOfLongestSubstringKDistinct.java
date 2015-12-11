import java.util.HashMap;
import java.util.Map;

/**
 * Created by lenov0 on 2015/12/10.
 */
public class LengthOfLongestSubstringKDistinct {

    /**
     * @param s : A string
     * @return : The length of the longest substring
     *           that contains at most k distinct characters.
     */
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        // write your code here
        if (s == null || k <= 0) {
            return 0;
        }

        Map<Character, Integer> charMap = new HashMap<>();
        int longestLength = 0;
        int start = 0;
        for (int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if (charMap.containsKey(ch)) {
                charMap.put(ch, charMap.get(ch) + 1);
            } else {
                charMap.put(ch, 1);
            }
            if (charMap.size() <= k) {
                longestLength = Math.max(longestLength, i - start + 1);
            } else {
                while (charMap.size() > k) {
                    char atStart = s.charAt(start);
                    charMap.put(atStart, charMap.get(atStart) - 1);
                    if (charMap.get(atStart) == 0){
                        charMap.remove(atStart);
                    }
                    start++;
                }
            }
        }

        return longestLength;
    }

}
