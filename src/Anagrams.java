import java.util.*;

/**
 * Created by Administrator on 2015/12/11.
 */
public class Anagrams {
    /**
     * @param strs: A list of strings
     * @return: A list of strings
     */
    public List<String> anagrams(String[] strs) {
        // write your code here
        List<String> result = new ArrayList<>();
        Map<String, Integer> stringMap = new HashMap<>();

        for (String str : strs){
            String sorted = sortString(str);
            if (stringMap.containsKey(sorted)){
                stringMap.put(sorted, stringMap.get(sorted) + 1);
            } else {
                stringMap.put(sorted, 1);
            }
        }

        for (String str : strs) {
            String sorted = sortString(str);
            int count = stringMap.get(sorted);
            if (count > 1){
                result.add(str);
            }
        }

        return result;
    }

    private String sortString(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);
        return sorted;
    }
}
