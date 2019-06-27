package week_1.BasicMath;

import java.util.ArrayList;
import java.util.List;

/**
 * SOLVED
 */
public class FizzBuzzSOLVED {
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<String>();
        for(int num = 1; num < (n + 1); num++) {
            if((num % 3 == 0) && (num % 5 == 0)) {
                list.add("FizzBuzzSOLVED");
            } else if(num % 3 == 0) {
                list.add("Fizz");
            } else if(num % 5 == 0) {
                list.add("Buzz");
            } else {
                list.add(Integer.toString(num));
            }
        }
        return list;
    }
}
