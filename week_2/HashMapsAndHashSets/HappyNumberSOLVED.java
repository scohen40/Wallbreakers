package week_2.HashMapsAndHashSets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * SOLVED
 */
public class HappyNumberSOLVED {
    public boolean isHappy(int n) {
        boolean isHappy = false;

        boolean keepChecking = true;
        int num = n;
        List<Integer> digits;
        int result = 0;
        Set<Integer> results = new HashSet<>();

        while(keepChecking) {
            //first dump all the digits into the digits array
            digits = new ArrayList<>();
            do{
                digits.add(num % 10);
                num = num / 10;
            } while(num >= 1);

            //add up the sum of the squares of the digits
            for(int digit : digits) {
                result = result + (digit*digit);
            }

            //see if should keep checking
            if(result == 1) {
                isHappy = true;
                keepChecking = false;
            } else if(results.contains(result)) {
                keepChecking = false;
            } else {
                results.add(result); //add the new result to the set
                num = result;        //reset num to the new number
                result = 0;          //reset result
            }

        }

        return isHappy;
    }
}
