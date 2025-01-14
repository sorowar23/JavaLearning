package javalearning.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

public class ArraysMethods {
    public static void main(String[] args) {

        String[] arr1 = {"Vlovo", "BMW", "Lexus"};
        String[] arr2 = {"Vlovo", "BMW", "Lexus"};
        int nums[] = {10,15,12,20,40,30,35};
        Integer[] numbers = {10,20,40,30,35};
        //e.g - compare()
        System.out.println("Output:compare()::"+ Arrays.compare(arr1, arr2));
        //e.g - equals()
        System.out.println("Output:equals()::"+Arrays.equals(arr1, arr2));
        //The fill() method fills an array with a specified value.Start and end position can be specified. If not, all elements will be filled.
        String[] fruits = {"Banana", "Orange", "Apple", "Mango"};
        System.out.println("Array length::"+fruits.length);
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

        //e.g - binarySearch()
        Arrays.sort(nums);
        int index = Arrays.binarySearch(nums, 20);
        System.out.println("Output:binarySearch():: "+index);
        int index_notFound = Arrays.binarySearch(nums, 13);
        System.out.println("Output:binarySearch():: "+index_notFound);

        //e.g - toString()
        System.out.println(Arrays.toString(nums));

        //e.g - asList()
        List<Integer> numberList = Arrays.asList(numbers);
        //numberList.add(5); - Not possible because convert an array into a fixed-size list will get UnsupportedOperationException
        System.out.println("Output:asList()::"+numberList);
        //e.g - copyOf()
        int[] arrayCopy = Arrays.copyOf(nums, 10);
        System.out.println("Output:arrayCopy()::");
        arrayCopy[7] = 4;
        arrayCopy[8] = 6;
        for(int arr: arrayCopy){
            System.out.print(arr+" ");
        }
        String[] copyArrayString = new String[5];
        System.arraycopy(arr1, 0, copyArrayString, 2, 3);
        System.out.println("Output:arraycopy()::");
        for(String arrSt: copyArrayString){
            System.out.print(arrSt+" ");
        }
        //e.g - copyOfRange()
        String[] names = {"John", "Joe","Mike", "James", "Robert"};
        //String[] namesCopy = Arrays.copyOfRange(names, 2, 5);
        //String[] namesCopy = Arrays.copyOfRange(names, 2, 7);
        String[] namesCopy = Arrays.copyOfRange(names, 2, 4);
        System.out.println("Output:copyOfRange()::");
        for(String name: namesCopy){
            System.out.println(name);
        }
        //e.g - setAll()
        // initialize array
        int array[] = { 1, 2, 3, 5, 8 };

        System.out.print("Original Array: [");
        // print the array
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("]");

        Arrays.setAll(array, i -> array[i] + 10 );

        System.out.print("Modified Array: [");
        // print the array
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("]");

        //e.g - spliterator()
        //Spliterator = Splitting + Iterator
        /* It uses tryAdvance() method to iterate elements individually in multiple threads to support Parallel Processing,
        The forEachRemaining() method to iterate elements sequentially in a single thread,
        The trySplit() method is used to divide itself into sub-Spliterators to support Parallel Processing.*/

        String[] strArray = {"Apple", "Banana", "Orange", "Mango", "Jack Fruits"};
        Spliterator<String> s1 = Arrays.spliterator(strArray);

        // Iterate over the elements using tryAdvance()
        System.out.println("Iterating using tryAdvance():");
        s1.tryAdvance(System.out::println);
        s1.tryAdvance(System.out::println);
        s1.tryAdvance(System.out::println);

        System.out.println("-------------------------");

        Spliterator<String> s2 = s1.trySplit();
        System.out.println("Spliterator1 Output:");
        s1.forEachRemaining(System.out::println);

        System.out.println("Spliterator2 Output:");
        if (s2 != null)
            s2.forEachRemaining(System.out::println);

    }

}
