import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.util.HashMap;

/**
 * Created by lenov0 on 2015/12/19.
 */
public class MinWindow {
    /**
     * @param source: A string
     * @param target: A string
     * @return: A string denote the minimum window
     *          Return "" if there is no such a string
     */
    public String minWindow(String source, String target) {
        // write your code
        String ret = "";
        if (source.length() < target.length()){
            return ret;
        }

        //key:字符,value:字符出现的次数
        HashMap<Character, Integer> dict = new HashMap<>();
        for (int i = 0; i < target.length(); i++){
            Character ch = target.charAt(i);
            if (dict.containsKey(ch)){
                dict.put(ch, dict.get(ch) + 1);
            } else {
                dict.put(ch, 1);
            }
        }

        HashMap<Character, Integer> founded = new HashMap<>();
        int left = 0;
        int right = 0;
        int foundedCount = 0;
        int minWidth = Integer.MAX_VALUE;
        while (right < source.length()){
            Character ch = source.charAt(right);
            if (!dict.containsKey(ch)){
                right++;
                continue;
            }

            if (founded.containsKey(ch)) {
                founded.put(ch, founded.get(ch) + 1);
                if (dict.get(ch) >= founded.get(ch)){
                    foundedCount++;
                }
            } else {
                founded.put(ch, 1);
                foundedCount++;
            }

            if (foundedCount == target.length()){
                Character leftChar = source.charAt(left);
                while (!dict.containsKey(leftChar) || dict.get(leftChar) < founded.get(leftChar)){
                    if (dict.containsKey(leftChar) && dict.get(leftChar) < founded.get(leftChar)){
                        founded.put(leftChar, founded.get(leftChar) - 1);
                    }
                    left++;
                    leftChar = source.charAt(left);
                }

                int curWidth = right - left + 1;
                if (minWidth > curWidth){
                    minWidth = curWidth;
                    ret = source.substring(left, right + 1);
                }
            }

            right++;
        }

        return ret;
    }
}
