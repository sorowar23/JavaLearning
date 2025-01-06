package javalearning.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("John", 25);
        hashMap.put("Smith", 35);
        hashMap.put("Smith", 39);
        hashMap.put(null, 28);
        hashMap.put("Mike", 30);
        hashMap.put(null, 40);
        hashMap.put("Kebin", 28);
        hashMap.put("Joe", 32);
        hashMap.put("Tasif", null);
        hashMap.put("Sohan", null);

        HashMap<String, Integer> hashMap2 = new HashMap<>(hashMap);
        HashMap<String, Integer> hashMap3 =  (HashMap) hashMap2.clone();
        System.out.println("Mappings of Hashmap1 are: "+ hashMap);
        System.out.println("Mappings of Hashmap2 are: "+hashMap2);

        hashMap2.put("Smith", 50);
        System.out.println("Mappings of Hashmap2 are after Update: "+hashMap2);

        hashMap2.remove("Smith");
        System.out.println("Mappings of Hashmap2 are after Remove: "+hashMap2);

       for(Map.Entry<String,Integer> item: hashMap.entrySet()){
           System.out.println("Key"+ item.getKey()+"Value "+ item.getValue());
       }
        System.out.println("Mappings of hashmap3 after clone: "+ hashMap3);

        System.out.println("IS the key 'Sohan': "+ hashMap3.containsKey("Sohan"));
        System.out.println("IS the value '33': "+ hashMap3.containsValue(33));

        System.out.println("The Set is: "+ hashMap.keySet());

        System.out.println("The collection is: "+ hashMap.values());


    }
}