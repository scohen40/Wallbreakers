package week_1.SampleStringManipulation;

public class ReverseStringSOLVED {

    /**
     * SOLVED
     */
    public static void main(String[] args) {
        char[] s = new char[]{'h', 'e', 'l', 'l', 'l'};

        reverseString(s);
        System.out.println(s);
    }

    public static void reverseString(char[] s) {
        for(int letter = 0; letter < (s.length)/2; letter++) {
            char temp1 = s[letter];
            char temp2 = s[s.length - 1 - letter];
            s[letter] = temp2;
            s[s.length - 1 - letter] = temp1;

        }
    }
}
