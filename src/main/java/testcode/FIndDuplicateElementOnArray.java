package testcode;

import java.util.HashSet;

public class FIndDuplicateElementOnArray {

    public static void main(String[] args) {
        int [] numbers = {3,5,10,20,2,4,3,10,3,5,4,6,11,20};
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicate = new HashSet<>();
        for(int num: numbers){
            if(!seen.add(num)){
                duplicate.add(num);
            }
        }
        System.out.println(duplicate);
    }

}
