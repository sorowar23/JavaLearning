package excercisepractice;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateOccuracneCountInArray {
    public static void main(String[] args) {
        int [] numbers = {3,5,10,20,2,4,3,10,3,5,4,6,11,20};
        Map<Integer, Integer> hashMap = new HashMap<>();

        for(int num: numbers){
            hashMap.put(num, hashMap.getOrDefault(num,0) +1);
        }
       // System.out.println(hashMap);

       for(Map.Entry<Integer,Integer> entry: hashMap.entrySet()){
           System.out.println(entry.getKey() + " : "+ entry.getValue());
       }
    }
}
