package week_1.BasicMath;

/**
 * SOLVED - I was way overthinking this simple problem!
 */
public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        boolean isPow = false;
        if(n == 1 || n == 2) {
            isPow = true;
        } else if(n == 0) {
            isPow = false;
        }
        else if (n % 2 == 0) {
            isPow = isPowerOfTwo(n/2);
        }
        return isPow;
    }
}
