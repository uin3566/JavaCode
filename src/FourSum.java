import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by Administrator on 2015/12/14.
 */
public class FourSum {
    /**
     * @param numbers : Give an array numbersbers of n integer
     * @param target : you need to find four elements that's sum of target
     * @return : Find all unique quadruplets in the array which gives the sum of
     *           zero.
     */
    public ArrayList<ArrayList<Integer>> fourSum(int[] numbers, int target) {
        /* your code */
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if (numbers == null || numbers.length < 4){
            return result;
        }

        int length = numbers.length;
        Arrays.sort(numbers);
        HashSet<ArrayList<Integer>> arraySet = new HashSet<>();

        for (int i = 0; i < length; i++){
            for (int j = i + 1; j < length; j++){
                int begin = j + 1;
                int end = length - 1;
                while (begin < end){
                    int sum = numbers[i] + numbers[j] + numbers[begin] + numbers[end];
                    if (sum == target){
                        ArrayList<Integer> arrayList = new ArrayList<>();
                        arrayList.add(numbers[i]);
                        arrayList.add(numbers[j]);
                        arrayList.add(numbers[begin]);
                        arrayList.add(numbers[end]);
                        arraySet.add(arrayList);
                        begin++;
                        end--;
                    } else if (sum < target){
                        begin++;
                    } else {
                        end--;
                    }
                }
            }
        }

        Iterator<ArrayList<Integer>> iterator = arraySet.iterator();
        while (iterator.hasNext()){
            result.add(iterator.next());
        }

        return result;
    }
}
