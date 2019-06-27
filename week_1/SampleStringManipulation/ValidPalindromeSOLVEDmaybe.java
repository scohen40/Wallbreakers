package week_1.SampleStringManipulation;

import java.util.ArrayList;
import java.util.List;


/**
 * SOLVED - I THINK
 * For some reason it failed the submission on leetcode,
 * but the test case that it said it failed passed on my end.
 */
public class ValidPalindromeSOLVEDmaybe {
    public static boolean isPalindrome(String s) {
        boolean isPal = true;

        //dump all the characters of the string into an array
        char[] string = s.toCharArray();
        //add only letters to an arraylist
        List newArr = new ArrayList();
        for(char c : string) {
            if(Character.isLetter(c)) {
                newArr.add(Character.toLowerCase(c));
            }
        }

        //check if the letters form an palindrome
        for(int c = 0; c < newArr.size()/2; c++) {
            if(newArr.get(c) != newArr.get(newArr.size()-1-c)) {
                isPal = false;
                break;
            }
        }



        return isPal;
    }
}
