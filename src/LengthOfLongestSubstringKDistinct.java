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
        int curLength = 0;
        int fromIndex = 0;

        for (int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if (charMap.containsKey(ch)){
                charMap.put(ch, charMap.get(ch) + 1);
                curLength++;
            } else {
                if (charMap.size() == k){
                    curLength = i - fromIndex;
                    if (curLength > longestLength){
                        longestLength = curLength;
                    }
                    char first = s.charAt(fromIndex);
                    if (charMap.get(first) > 1) {
                        fromIndex = s.lastIndexOf(first, i);
                    } else {
                        fromIndex += 1;
                    }
                    curLength = i - fromIndex;
                    charMap.remove(first);
                }
                charMap.put(ch, 1);
                longestLength++;
            }

            if (curLength > longestLength){
                longestLength = curLength;
            }
        }

        return longestLength;
    }

}
