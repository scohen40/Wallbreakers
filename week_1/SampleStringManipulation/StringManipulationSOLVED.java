package week_1.SampleStringManipulation;

/**
 * SOLVED - I would love to use regex since it would have made this whole process design and running faster,
 * but I tried figuring it out and I couldn't fast enough to have made it worth it.
 */
public class StringManipulationSOLVED {

    public static boolean detectCapitalUse(String word) {
        char[] string = 

        boolean isCap = true;
        boolean keepChecking = true;
        char[] string = word.toCharArray();

        //is the first character upper case
        if(Character.isUpperCase(string[0])) {
            //if the string size is over one character
            if(string.length > 1) {
                //if the second is upper case, check the rest
                if(Character.isUpperCase(string[1])) {
                    // if after the second all are upper case it's correct
                    while(keepChecking) {
                        for(char c : string) {
                            if(Character.isLowerCase(c)) {
                                //if not all uppercase it's incorrect
                                isCap = false;
                                keepChecking = false;
                            }
                        }
                        keepChecking = false;

                    }

                }
                //if the second is lower case, check the rest
                else {
                    while(keepChecking) {
                        //if all after first are lowercase, it's correct
                        for(int c = 1; c < string.length; c++) {
                            if(Character.isUpperCase(string[c])) {
                                //if not it's incorrect
                                isCap = false;
                                keepChecking = false;
                            }
                        }
                        keepChecking = false;

                    }

                }

            }
        }
        //if the first isn't uppercase, check the rest
        else {
            if(string.length > 1) {
                while(keepChecking) {
                    //if all are lowercase, it's correct
                    for(char c : string) {
                        if(Character.isUpperCase(c)) {
                            //if not it's incorrect
                            isCap = false;
                            keepChecking = false;
                        }
                    }
                    keepChecking = false;
                }
            }
        }
        return isCap;
    }
}
