package week_1.BasicMath;

import java.util.ArrayList;
import java.util.List;

/**
 * SOLVED
 */
public class SelfDevidingNumbersSOLVED {
    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();

        for(int num = left; num <= right; num++) {
            boolean isDev = true;
            for(int n = num; n >= 1; n/=10) {
                int digit = n % 10;
                if(digit == 0 || num % digit != 0) {
                    isDev = false;
                    break;
                }
            }
            if(isDev) {
                list.add(num);
            }
        }

        return list;
    }

}
