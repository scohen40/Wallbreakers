package week_2.MultiSets;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * SOLVED
 */
public class MostCommonWordSOLVED {
    public String mostCommonWord(String paragraph, String[] banned) {
        String[] p = paragraph.split("\\W");

        //load all of the banned words into a set
        Set<String> bw = new HashSet<>();
        for(String word : banned) {
            bw.add(word);
        }

        //load all of the non banned words into a map
        Map<String, Integer> nbw = new HashMap<>(); //the paragraph words not banned
        for(String word : p) {
            if(word.length() > 0) {
                if(!bw.contains(word.toLowerCase())) {
                    if(!nbw.containsKey(word.toLowerCase())) {
                        nbw.put(word.toLowerCase(), 1);
                    } else {
                        Integer newCount = nbw.get(word.toLowerCase()) + 1;
                        nbw.put(word.toLowerCase(), newCount);
                    }

                }
            }
        }

        //put in the first data item in the map
        // Map.Entry<String,Integer> entry = nbw.entrySet().iterator().next();
        // final String[] mostUsed = {entry.getKey()};
        // final Integer[] highestCount = {entry.getValue()};
        final String[] mostUsed = {""};
        final Integer[] highestCount = {0};
        nbw.forEach((word, count) -> {
            if(count > highestCount[0]) {
                highestCount[0] = count;
                mostUsed[0] = word;
            }

        });

        return mostUsed[0];
    }
}
