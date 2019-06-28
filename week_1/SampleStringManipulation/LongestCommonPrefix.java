package week_1.SampleStringManipulation;

/**
 * This solution took a really long time and I wasn't close to solving it,
 * so I moved on.
 * There has to be a better way to do it than what I did so far.
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String string = " ";
        char[][] arr = new char[strs.length][];
        List<char> prefix = new ArrayList<char>();

        //dump all of the strings in strs into the rows of arr
        for(int row = 0; row < strs.length; row++) {
            arr[row] = Character.toCharArray(strs[row]);
        }

        char temp = arr[0][0];
        boolean isFirst = true;
        //see if all of the first letters are the same
        for(int row = 1; row < arr.length; row++) {
            if(arr[row][0] != temp) {
                isFirst = false;
                break;
            }
            prefix.add(temp)
        }

        //if all the same add the first then check the rest (start with the second column)
        if(isFirst) {
            int col = 1; //start with the second column
            int row = 0;
            boolean keepChecking = true;
            while(keepChecking) {
                temp = arr[row][col]
                //go through every row in the current column
                for(row = 0; col < arr[row][col]; row++) {
                    if(arr[row][col] != temp);

                }
                col++; //increment column
            }
            //if the rest aren't
        }

        //if first aren't all the same immediately return string, because we're done
        return string;
    }
}
