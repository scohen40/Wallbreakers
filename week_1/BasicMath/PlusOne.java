package week_1.BasicMath;

/**
 * SOLVED - had to ask for design help and looked up answers in the discussion board,
 * as I couldn't come up with the answer on my own :/.
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i] = digits[i] + 1;
                return digits;
            } else {
                digits[i] = 0;
            }
        }

        int[] newArr = new int[digits.length + 1];
        newArr[0] = 1;
        return newArr;
    }
}
