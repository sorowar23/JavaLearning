package javalearning.arrays;

import java.util.Arrays;

public class ArraysMethods {
    public static void main(String[] args) {
        String[] arr1 = {"Vlovo", "BMW", "Lexus"};
        String[] arr2 = {"Vlovo", "BMW", "Lexus"};
        System.out.println(Arrays.compare(arr1, arr2));
        System.out.println(Arrays.equals(arr1, arr2));
        //The fill() method fills an array with a specified value.Start and end position can be specified. If not, all elements will be filled.
        String[] fruits = {"Banana", "Orange", "Apple", "Mango"};
        System.out.println("Array lenght::"+fruits.length);
       // Arrays.fill(fruits,"Blue Barry");
        Arrays.fill(fruits, 2, 3, "Kiwi");
        for (String i : fruits) {
            System.out.println(i);
        }

        System.out.println("-----------------------------------");
        String[] cars = {"Volvo", "BMW", "Tesla", "Ford", "Fiat", "Mazda", "Audi"};
        Arrays.sort(cars);
        //Arrays.sort(cars, 2, 5);
        for(String car: cars){
            System.out.println(car);
        }

    }

}
