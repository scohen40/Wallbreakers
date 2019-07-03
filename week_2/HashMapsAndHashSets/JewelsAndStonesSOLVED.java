package week_2.HashMapsAndHashSets;

import java.util.HashSet;
import java.util.Set;

/**
 * SOLVED
 */
public class JewelsAndStonesSOLVED {
    public int numJewelsInStones(String J, String S) {
        int numStones = 0;

        char[] jewelArr = J.toCharArray();
        char[] stoneArr = S.toCharArray();
        Set<Character> jewelSet = new HashSet<>();

        for(char jewel: jewelArr) {
            jewelSet.add(jewel);
        }

        for(char stone: stoneArr) {
            if(jewelSet.contains(stone)) {
                numStones++;
            }
        }


        return numStones;
    }
}
