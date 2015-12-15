import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by lenov0 on 2015/12/15.
 */
public class MajorityNumber {
    /**
     * @param nums: A list of integers
     * @param k: As described
     * @return: The majority number
     */
    public int majorityNumber(ArrayList<Integer> nums, int k) {
        // write your code
        HashMap<Integer, Integer> intMap = new HashMap<>();

        for (Integer key : nums){
            if (intMap.containsKey(key)){
                intMap.put(key, intMap.get(key) + 1);
            } else {
                intMap.put(key, 1);
            }

            if (intMap.size() == k){
                Iterator<Map.Entry<Integer, Integer>> iterator = intMap.entrySet().iterator();
                while (iterator.hasNext()){
                    Map.Entry<Integer, Integer> entry = iterator.next();
                    entry.setValue(entry.getValue() - 1);
                    if (entry.getValue() == 0){
                        iterator.remove();
                    }
                }
            }
        }

        for (Integer key : intMap.keySet()){
            intMap.put(key, 0);
        }

        for (int i = 0; i < nums.size(); i++){
            int key = nums.get(i);
            if (intMap.containsKey(key)){
                intMap.put(key, intMap.get(key) + 1);
            }
        }

        double target = (double)nums.size() / (double)k;
        int major = -1;
        for (Integer key : intMap.keySet()){
            int times = intMap.get(key);
            if (times > target && times > major){
                major = key;
            }
        }

        return major;
    }
}
