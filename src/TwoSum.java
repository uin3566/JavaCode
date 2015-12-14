import java.util.HashMap;

/**
 * Created by lenov0 on 2015/12/14.
 */
public class TwoSum {
 /**
 * @param numbers : An array of Integer
 * @param target : target = numbers[index1] + numbers[index2]
 * @return : [index1 + 1, index2 + 1] (index1 < index2)
 */
    public int[] twoSum(int[] numbers, int target) {
        // write your code here
        HashMap<Integer, Integer> indexMap = new HashMap<>();

        for (int i = 0; i < numbers.length; i++){
            indexMap.put(numbers[i], i);
        }

        for (int i = 0; i < numbers.length; i++){
            int other = target - numbers[i];
            if (indexMap.containsKey(other)){
                int index = indexMap.get(other);
                if (index > i){
                    return new int[]{i + 1, index + 1};
                }
            }
        }

        return null;
    }
}
