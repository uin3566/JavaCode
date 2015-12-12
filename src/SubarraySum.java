import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by lenov0 on 2015/12/12.
 */
public class SubarraySum {
    /**
     * @param nums: A list of integers
     * @return: A list of integers includes the index of the first number
     *          and the index of the last number
     */
    public ArrayList<Integer> subarraySum(int[] nums) {
        // write your code here
        ArrayList<Integer> index = new ArrayList<>();

        if (nums == null || nums.length == 0){
            return index;
        }

        //map中第一个参数是sum，第二个参数是数组序号
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int sum = 0;

        for (int i = 0; i < nums.length; i++){
            sum += nums[i];
            if (map.containsKey(sum)){
                int first = map.get(sum) + 1;
                index.add(first);
                index.add(i);
                break;
            } else {
                map.put(sum, i);
            }
        }

        return index;
    }
}
