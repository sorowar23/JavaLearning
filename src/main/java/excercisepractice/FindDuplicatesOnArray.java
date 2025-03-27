package excercisepractice;

import java.util.HashSet;

public class FindDuplicatesOnArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 7, 3, 8, 2, 8, 5, 5};
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();
        int count = 0;

        for(int arr1: arr){
            if(!seen.add(arr1)){
                duplicates.add(arr1);
                count++;
            }
        }
        System.out.println(duplicates);
        System.out.println("Duplicates count on Array: "+count);
    }
}
