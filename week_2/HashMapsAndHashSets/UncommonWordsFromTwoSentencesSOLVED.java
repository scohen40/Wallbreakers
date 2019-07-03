package week_2.HashMapsAndHashSets;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * SOLVED
 */
public class UncommonWordsFromTwoSentencesSOLVED {
    public String[] uncommonFromSentences(String A, String B) {
        //dump all the words into an arraylist
        List<String> words = new ArrayList<>();
        String[] strings = A.split(" ");
        for(String string : strings) {
            words.add(string);
        }
        strings = B.split(" ");
        for(String string : strings) {
            words.add(string);
        }

        Map<String, Integer> uncommonWords = new HashMap<>();
        for(String word : words) {
            if(uncommonWords.containsKey(word)) {
                Integer count = uncommonWords.get(word);
                count++;
                uncommonWords.put(word, count);
            } else {
                uncommonWords.put(word, 1);
            }
        }

        //return set to string
        List<String> finalWords = new ArrayList<>();
        uncommonWords.forEach((word, count) -> {
                    if(count == 1) {
                        finalWords.add(word);
                    }
                }
        );

        String[] uncommonArr = new String[finalWords.size()];
        uncommonArr = finalWords.toArray(uncommonArr);

        return uncommonArr;
    }
}
