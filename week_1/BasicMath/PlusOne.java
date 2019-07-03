package week_1.BasicMath;

/**
 * Misunderstood the question. Will fix later.
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {

        //dump all of the digits into one Integer but first putting them into a string and then an Integer.
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < digits.length; i++) {
            sb.append(digits[i]);
        }
        Integer num = Integer.parseInt(sb.toString());

        num++;          //increment by 1

        //dump into a new array
        int[] arr = num;

        return arr;
    }
}
