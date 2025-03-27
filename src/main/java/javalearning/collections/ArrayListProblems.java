package javalearning.collections;

import java.util.*;

/*
1.Write a Java program to create an ArrayList, add elements to it, and print the list.

2.ArrayList Iteration
Implement 3 different ways to iterate over an ArrayList:
Using for loop
Using enhanced for-loop (for-each)
Using Iterator

3.Search an Element in ArrayList
Write a function to check if an element exists in an ArrayList.

4. Remove Duplicates from an ArrayList
Given an ArrayList of integers, write a method to remove duplicates while maintaining the original order.

5.Reverse an ArrayList
Write a method to reverse an ArrayList in-place without using extra space.
*/
public class ArrayListProblems {
    public static List<String> createArrayList(){
        ArrayList<String> cityNames = new ArrayList<>();
            cityNames.add("Jamaica");
            cityNames.add("Bellerose");
            cityNames.add("Holis");
            cityNames.add("Long Island");
            cityNames.add("West Berey");

       return cityNames;
    }
    public static <T> boolean elementExists(ArrayList<T> list, T target) {
        return list.contains(target);
    }

    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> numbers){
        Set<Integer> set = new LinkedHashSet<>();
        set.addAll(numbers);
        numbers.clear();
        numbers.addAll(set);
        return numbers;
    }

    public static void reverseInPlace(ArrayList<Integer> inputList){
        int left = 0;
        int right = inputList.size() -1;
        while(left < right){
            Integer temp = inputList.get(left);
            inputList.set(left, inputList.get(right));
            inputList.set(right,temp);
            left++;
            right--;
        }
    }


    public static void main(String[] args) {
        //For Program 1:
        System.out.println("Program 1:"+ createArrayList());
        System.out.println("Program 2:");
        System.out.println("--------------------");
        //For Program 2:
        //Using for loop
        ArrayList<String> cityList = (ArrayList<String>) createArrayList();
        for(int i = 0; i<cityList.size(); i++){
            System.out.println(cityList.get(i));
        }

        System.out.println("--------------------");
        //Using enhanced for-loop (for-each)
        for(String city: cityList){
            System.out.println(city);
        }
        System.out.println("--------------------");
        //Using Iterator
        Iterator<String> iterator = cityList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("--------------");
        System.out.println("Program 3:");
        boolean isExist =elementExists(cityList,"Bellerose");
        System.out.println(isExist);

        System.out.println("--------------");
        System.out.println("Program 4:");
        ArrayList<Integer> numberList = new ArrayList<>(Arrays.asList(10,15,10,20,25,15,30,35,40,45,40));
        ArrayList<Integer> newList = removeDuplicates(numberList);
        System.out.println(newList);

        System.out.println("--------------");
        System.out.println("Program 5:");
        reverseInPlace(newList);
        System.out.println(newList);

    }
}
