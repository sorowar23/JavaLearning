package javalearning.collections;

import java.util.*;

/*
6. Sort an ArrayList
Implement a method to sort an ArrayList in:
Ascending order
Descending order

7. Find Maximum and Minimum Values
Given an ArrayList of numbers, write a function to find the largest and smallest elements.

8.Merge Two ArrayLists
Write a Java function to merge two ArrayLists and remove duplicates.

9.Rotate an ArrayList
Rotate an ArrayList to the right by k steps.

10.Custom Sorting of Objects
Create a Person class (with name and age fields) and:
Sort an ArrayList<Person> by age.
Sort by name alphabetically.

11.Find Missing Number
Given an ArrayList of n-1 integers ranging from 1 to n, find the missing number.

12. Intersection of Two ArrayLists
Find common elements between two ArrayLists.

13. Efficiently Remove Elements
Remove all even numbers from a large ArrayList.
(Hint: Use Iterator to avoid ConcurrentModificationException.)

14.Dynamic Resizing Behavior
Explain how ArrayList grows internally and compare it to a LinkedList.

15.Convert ArrayList to Array
Convert an ArrayList of integers to a primitive int[] array.
(Hint: Use toArray() and Arrays.stream().)
 */
public class ArrayListProblem2 {
    public static void main(String[] args) {
        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(10);
        numberList.add(5);
        numberList.add(12);
        numberList.add(2);
        numberList.add(9);
        numberList.add(5);
        numberList.add(12);
        numberList.add(10);
       // Collections.sort(numberList);
        //numberList.sort(Collections.reverseOrder());
        for (Integer number: numberList){
            System.out.println(number);
        }
        System.out.println("----------------------");
        int min = numberList.get(0);
        for(int i =0 ; i<numberList.size(); i++){
            if(numberList.get(i) < min){
                min = numberList.get(i);
            }
        }
        System.out.println("Minimum Element on Arraylist::"+ min);

        System.out.println("----------------------");

        int max = numberList.get(0);
        for(int j = 0; j<numberList.size(); j++ ){
            if(numberList.get(j) > max){
                max = numberList.get(j);
            }
        }
        System.out.println("Maximum Element on ArrayList::" + max);

        ArrayList<Integer> numberList2 = new ArrayList<>();
        numberList2.add(20);
        numberList2.add(30);
        numberList2.add(25);
        numberList2.add(28);
        numberList2.add(30);
        numberList2.add(25);
        System.out.println("----------------------");
      //  numberList.addAll(numberList2);
     //   System.out.println(numberList);


        Set<Integer> set = new HashSet<>();
        set.addAll(numberList);
        set.addAll(numberList2);
        System.out.println(set);

    }
}
