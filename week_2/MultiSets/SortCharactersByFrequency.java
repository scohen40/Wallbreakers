package week_2.MultiSets;

import java.util.*;

/**
 * Got this error while running on leetcode: Memory Limit Exceeded
 * Will come back to this!
 */
public class SortCharactersByFrequency {
    public String frequencySort(String s) {
        //put all the characters in an array
        char[] chars = s.toCharArray();
        Arrays.sort(chars);


        //create a map/multi and put all of the character in the array with counts as well as a list to put all the unique chars
        Map<Character, Integer> map = new HashMap<>();
        List<Character> uniqueChars = new ArrayList<>();
        for (char c : chars) {
            Character C = c;
            if (!map.containsKey(C)) {
                map.put(C, 1);
                uniqueChars.add(C);
            } else {
                Integer newCount = map.get(C) + 1;
                map.put(C, newCount);
            }
        }

        //loop through the chars and add in by frequency
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while(sb.length() < s.length()) {
            for(Character c : uniqueChars) {
                if(map.get(c) == i) {
                    for(int j = 0; j < i; j++) {
                        sb.append(c);
                        i++;
                    }
                } else {
                    i++;
                }
            }
        }

        return sb.toString();
    }

}
