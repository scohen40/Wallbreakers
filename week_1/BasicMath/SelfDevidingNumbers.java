package week_1.BasicMath;

import java.util.ArrayList;
import java.util.List;

/**
 *     With a list form 1 to 22, for some reason I can't get the list to continue past 17/18.
 *     When I make the int left 17, it doesn't even go past the second for loop, and the whole
 *     list is immediately returned.
 */
public class SelfDevidingNumbers {
    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> startNums = new ArrayList<Integer>();
        for(int i = left; i < right + 1; i++) {
            startNums.add((Integer) i);
        }

        for(Integer integer = startNums.get(0); integer < startNums.size(); integer++) {
            boolean isDev = true;
            char[] charArr = integer.toString().toCharArray();
            for(char c: charArr) {
                Integer characterValue = Character.getNumericValue(c);
                if(characterValue != 0) {
                    int remainder = integer % characterValue;
                    if(remainder != 0) {
                        isDev = false;
                        break;
                    }
                } else if(characterValue == 0){
                    isDev = false;
                    break;
                } else {

                }


            }
            if(isDev == false) {
                startNums.remove(integer);
            }
            isDev = true;
        }

        return startNums;
    }

}
