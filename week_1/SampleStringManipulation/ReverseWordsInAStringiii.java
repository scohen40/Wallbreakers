package week_1.SampleStringManipulation;

/**
 * I got the whole this to reverse and then realized that I was supposed to reverse each word in order.
 * I was still working on trying to get each substring to reverse correctly,
 * but it was taking a ton of time, so I moved on.
 */
public class ReverseWordsInAStringiii {

    public String reverseWords(String s) {
        //put string in a char array to loop through
        char[] string = s.toCharArray();

        //index for beginning of currect 'substring', starting at the beginning of the string.
        int beginning = 0;
        //the size of the 'substring' to reverse
        int substringLength;
        //loop through the whole string
        for(int i = 0; i < string.length; i++) {
            //when we reach a whitespace reverse 'substring'
            if(i == string.length - 1) {
                substringLength = i - beginning + 1;
                char temp;
                for(int c = beginning; c < (i-beginning)/2; c++) {
                    temp = string[c];
                    string[c] = string[stringSize - 1 - c];
                    string[string.length - 1 - c] = temp;
                }
            } else if(Character.isWhitespace(string[i])) {
                int substringLength = i-beginning;
                char temp;
                for(int c = beginning; c < i-(substringLength/2); c++) {
                    temp = string[c];
                    string[c] = string[stringSize - 1 - c];
                    string[string.length - 1 - c] = temp;
                }
            }
        }





        String reverse = new String(string);
        return reverse;
    }

}
