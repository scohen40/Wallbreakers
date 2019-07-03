package week_2.HashMapsAndHashSets;

import java.util.*;

/**
 * SOLVED
 */
public class UniqueMorseCodeWordsSOLVED {
    public int uniqueMorseRepresentations(String[] words) {
        //set everything up
        //1. dump all of the words into a List of Arrays
        List<char[]> wordList = new ArrayList<>();
        for(String word : words) {
            wordList.add(word.toCharArray());
        }
        //2. create the morse code table
        Character letter = 'a';
        String[] morseValues = new String[] {
                ".-","-...","-.-.","-..",".","..-.","--.","....","..",".---",
                "-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",
                ".--","-..-","-.--","--.."};
        Map<Character, String> morseCode = new HashMap<>();
        for(String value : morseValues) {
            morseCode.put(letter, value);
            letter++; //increment to the next letter
        }
        //3. create a hashset holder for unique word transformations
        Set<String> transformations = new HashSet<>();

        //search through each word to add only new transformations
        for(char[] word : wordList) {
            StringBuilder sb = new StringBuilder();
            for(char l : word) {
                sb.append(morseCode.get(Character.valueOf(l)));
            }
            if(!transformations.contains(sb.toString())) {
                transformations.add(sb.toString());
            }
        }

        return transformations.size();
    }
}
