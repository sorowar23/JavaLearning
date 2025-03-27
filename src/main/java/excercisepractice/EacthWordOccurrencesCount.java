package excercisepractice;

import java.util.HashMap;
import java.util.Map;

public class EacthWordOccurrencesCount {

    public static Map<String, Integer> countWordOccurrences(String stringText){
        Map<String, Integer> hashMap = new HashMap<>();
        stringText = stringText.replaceAll("[^a-zA-Z0-9 ]", "").toLowerCase();
        String [] wordCountArray = stringText.split("\\s+");

        for (String words : wordCountArray) {
            hashMap.put(words, hashMap.getOrDefault(words,0) + 1 );
        }
       return hashMap;
    }
    public static void main(String[] args) {
        String stringText = "ava is great! Java is powerful. Java is used everywhere.";
        Map<String, Integer> wordCounts = countWordOccurrences(stringText);

        for(Map.Entry<String, Integer> enty: wordCounts.entrySet()){
            System.out.println(enty.getKey() + ":" + enty.getValue());
        }
    }
}
