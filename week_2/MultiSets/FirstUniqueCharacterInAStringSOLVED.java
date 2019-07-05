package week_2.MultiSets;

import java.util.HashMap;
import java.util.Map;

/**
 * SOLVED
 */
public class FirstUniqueCharacterInAStringSOLVED {
    public int firstUniqChar(String s) {
        char[] chars = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();

        for(char c : chars) {
            Character C = c;
            if(!map.containsKey(C)) {
                map.put(C, 1);
            } else {
                Integer newCount = map.get(C) + 1;
                map.put(C, newCount);
            }
        }

        int index = -1;
        for(int i = 0; i < chars.length; i++) {
            if(map.get(chars[i]) == 1) {
                index = i;
                break;
            }
        }


        return index;

    }
}
