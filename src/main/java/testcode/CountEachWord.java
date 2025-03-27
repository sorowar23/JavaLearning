package testcode;

import java.util.HashMap;
import java.util.Map;

public class CountEachWord {

    public static Map<String, Integer> wordCount(String inputString){
        Map<String, Integer> hashMap = new HashMap<>();
        String sanitizeString = inputString.replaceAll("[^a-zA-Z0-9 ]", "").toLowerCase();
        String [] wordArray = sanitizeString.split("\\s");
        for(String word: wordArray){
            hashMap.put(word, hashMap.getOrDefault(word,0) + 1);
        }

        return hashMap;
    }

    public static void main(String [] args){
        String inputString = "Hello Java. Java is most used language on enterprise level software. Java is so power full language.";
        Map<String, Integer> wordCountMap =  wordCount(inputString);

        System.out.println(wordCountMap);
        for(Map.Entry<String, Integer> entry: wordCountMap.entrySet()){
            System.out.println(entry.getKey() + ": "+ entry.getValue());
        }
    }
}
