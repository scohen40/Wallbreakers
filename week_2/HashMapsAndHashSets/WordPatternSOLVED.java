package week_2.HashMapsAndHashSets;

import java.util.HashMap;
import java.util.Map;

/**
 * SOLVED
 */
public class WordPatternSOLVED {
    public boolean wordPattern(String pattern, String str) {
        //set up
        boolean followsPattern = true;
        String[] patternArr = pattern.split("");
        String[] strArr = str.split(" ");
        Map<String, String> dictionaryMap = new HashMap<>();

        if(patternArr.length != strArr.length
                || pattern.isEmpty()
                || str.isEmpty()) {
            followsPattern = false;
        } else {
            for(int i = 0; i < strArr.length; i++) {
                if(!dictionaryMap.containsValue(strArr[i])) {
                    dictionaryMap.put(patternArr[i],strArr[i]);
                }
            }

            //loop through words to make sure that it matches the pattern
            for(int i = 0; i < strArr.length; i++) {
                if(!strArr[i].equals(dictionaryMap.get(patternArr[i]))) {
                    followsPattern = false;
                    break;
                }
            }
        }


        return followsPattern;
    }
}
