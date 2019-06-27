package week_1.BasicMath;

/**
 * I haven't figured out a way to go backwards without square root, math-wise.
 * I'll have to look it up.
 */
public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        boolean isPow = false;
        if(n == 1 || n == 2) {
            isPow = true;
        } else if(n == 0) {
            isPow = false;
        } else if (n % 2 == 0) {
            //the problem is here. this is the wrong way to check.
            double sqrRt = Math.sqrt(n);
            if(sqrRt == (int) sqrRt) {
                isPow = isPowerOfTwo((int) sqrRt);
            } else {
                isPow = false;
            }
        } else {
            isPow = false;
        }
        return isPow;
    }
}
