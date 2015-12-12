import java.util.HashSet;
import java.util.Set;

/**
 * Created by lenov0 on 2015/12/12.
 */
public class IsHappy {
    /**
     * @param n an integer
     * @return true if this is a happy number or false
     */
    public boolean isHappy(int n) {
        // Write your code here
        if (n <= 0){
            return false;
        }

        Set<Integer> loopNumber = new HashSet<>();
        loopNumber.add(n);

        boolean ret = true;
        while (n != 1) {
            n = loopOnceNumber(n);
            if (loopNumber.contains(n)){
                ret = false;
                break;
            } else {
                loopNumber.add(n);
            }
        }

        return ret;
    }

    private int loopOnceNumber(int number){
        int ret = 0;

        String strNumber = String.valueOf(number);
        for (int i = 0; i < strNumber.length(); i++){
            char ch = strNumber.charAt(i);
            ret += Math.pow(Integer.parseInt(String.valueOf(ch)), 2);
        }

        return ret;
    }
}
