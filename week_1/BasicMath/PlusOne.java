package week_1.BasicMath;

/**
 * Misunderstood the question. Will fix later.
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {
        //create the new array
        int[] arr = new int[digits.length];
        for(int i = 0; i < digits.length; i++) {
            arr[i] = digits[i];
        }

        //add 1 to the last integer of the array
        arr[arr.length - 1]++;


        return arr;
    }
}
