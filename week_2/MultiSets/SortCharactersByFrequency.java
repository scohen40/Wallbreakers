package week_2.MultiSets;

import java.util.*;

/**
 * SOLVED - The runtime is super inefficient and I would like to speed it up!
 */
public class SortCharactersByFrequency {
    public String frequencySort(String s) {
        //put all the characters in an array
        char[] chars = s.toCharArray();
        Arrays.sort(chars);


        //create a map/multi and put all of the character in the array with counts as well as a list to put all the unique chars
        Map<Character, Integer> map = new HashMap<>();

        for (char c : chars) {
            Character C = c;
            if (!map.containsKey(C)) {
                map.put(C, 1);
            } else {
                Integer newCount = map.get(C) + 1;
                map.put(C, newCount);
            }
        }

        Map<Character, Integer> sortedMap = new LinkedHashMap<>();

        //sort the map
        map.entrySet().stream()
                .sorted(Map.Entry.<Character, Integer>comparingByValue().reversed())
                .forEachOrdered(entry -> sortedMap.put(entry.getKey(), entry.getValue()));

        //loop through the sorted map and add to string builder by frequency
        List<StringBuilder> finalSB = new ArrayList<>();
        finalSB.add(new StringBuilder());
        sortedMap.forEach((character, count) -> {
            for(int i = 0; i < count; i++) {
                finalSB.get(0).append(character);
            }
        });

        return finalSB.get(0).toString();
    }

}
