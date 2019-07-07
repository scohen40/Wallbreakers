package week_2.MultiSets;

import java.util.HashMap;
import java.util.Map;

/**
 * SOLVED
 */
public class FindTheDifferenceSOLVED {
    public char findTheDifference(String s, String t) {
        char difference = '.'; //should never return as this
        char[] charsS = s.toCharArray();
        Map<Character, Integer> mapS = new HashMap<>();
        for(char c : charsS) {
            Character C = c;
            if(!mapS.containsKey(C)) {
                mapS.put(C, 1);
            } else {
                Integer newCount = mapS.get(C) + 1;
                mapS.put(C, newCount);
            }
        }
        char[] charsT = t.toCharArray();
        Map<Character, Integer> mapT = new HashMap<>();
        for(char c : charsT) {
            Character C = c;
            if(!mapT.containsKey(C)) {
                mapT.put(C, 1);
            } else {
                Integer newCount = mapT.get(C) + 1;
                mapT.put(C, newCount);
            }
        }

        for(char c : charsT) {
            Character C = c;
            if(!mapS.containsKey(C)) {
                return c;
            } else if(mapS.get(C) != mapT.get(C)) {
                return c;
            }
        }


        return difference;
    }
}
