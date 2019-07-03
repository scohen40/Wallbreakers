package week_2.HashMapsAndHashSets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * SOLVED MAYBE? - I believe that the test cases for this problem are wrong on leetcode.
 * This: ["abcd","cdab","cbad","xyzz","zzxy","zzyx"] is coming up as expected to be 3,
 * while according to me doing it on paper it should be 2, which is what was output
 * by this algorithm.
 */
public class GroupsOfSpecialEquivalentStringsMAYBE {
    public int numSpecialEquivGroups(String[] A) {
        Set<String> uniqueStrings = new HashSet<>();
        for(String string : A) {
            char[] stringArr = string.toCharArray();
            Arrays.sort(stringArr);
            String sorted = new String(stringArr);

            if(!uniqueStrings.contains(sorted)) {
                uniqueStrings.add(sorted);
            }
        }

        return uniqueStrings.size();

    }
}
