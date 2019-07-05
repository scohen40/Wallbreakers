package week_2.HashMapsAndHashSets;

import java.util.HashMap;
import java.util.Map;

/**
 * SOLVED
 */
public class IsomorphicStringsSOLVED {
    public boolean isIsomorphic(String s, String t) {
        boolean isIso = true;

        Map<Character, Character> pattern  = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            if(!pattern.containsKey(s.charAt(i))) {
                if(pattern.containsValue(t.charAt(i))) {
                    isIso = false;
                    break;
                } else {
                    pattern.put(s.charAt(i), t.charAt(i));
                }
            }
            else { //contains s[i]
                //check that it's value on the map doesn't equal t[i]
                if(!pattern.get(s.charAt(i)).equals(t.charAt(i))) {
                    isIso = false;
                    break;
                }
            }
        }
        return isIso;
    }
}
