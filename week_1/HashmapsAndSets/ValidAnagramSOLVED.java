package week_1.HashmapsAndSets;

import java.util.Arrays;

/**
 * SOLVED - This would only work if the input is only lowercase alphabet letters and not spaces.
 */
public class ValidAnagramSOLVED {
    public boolean isAnagram(String s, String t) {
        boolean isAna = true;
        //dump and sort both strings into two char arrays
        char[] stringS = s.toCharArray();
        Arrays.sort(stringS);
        char[] stringT = t.toCharArray();
        Arrays.sort(stringT);

        //if the sizes are the same check if the letters match
        if(stringS.length == stringT.length) {
            for(int c = 0; c < stringS.length; c++) {
                //only continue if letters of the same index are a match
                if(stringS[c] != stringT[c]) {
                    isAna = false;
                    break;
                }
            }
            //if don't find a problem, then it returns true

        } else {  //if sizes aren't the same it's obviously not an anagram
            isAna = false;
        }

        return isAna;
    }
}
