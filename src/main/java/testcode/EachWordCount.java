package testcode;

import java.util.HashMap;
import java.util.Map;

public class EachWordCount {

    public static Map<String, Integer> countWordOccurance(String inputString){
        Map<String,Integer> hashMap = new HashMap<String, Integer>();
        String sanatizeInput = inputString.replaceAll("[^a-zA-Z0-9 ]", "").toLowerCase();
        String [] strArray = sanatizeInput.split("\\s");
        for(String str: strArray){
            hashMap.put(str, hashMap.getOrDefault(str,0) + 1);
        }
        return hashMap;

    }

    public static void main(String[] args) {
        String inputString = "Hello Java! Java is most used programming language, java used on enterprise software.";
        Map<String, Integer>  wordCount = countWordOccurance(inputString);
        //System.out.println(wordCount);

        for(Map.Entry<String,Integer> entry: wordCount.entrySet()){
            System.out.print(entry.getKey()+ " : " + entry.getValue() + " ");
        }

    }

}
