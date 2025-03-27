package javalearning.arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array={0,1,0,3,12};
        selectionSort(array);
        for(int arr: array){
            System.out.print(arr+" ");
        }
    }

    private static void selectionSort(int[] array) {
        for(int i =0; i<array.length -1; i++){
            //set first index as minimum
            int min = i;
            for(int j = i +1; j<array.length;j++){
                if(array[min] > array[j]){
                   //set  minimum val j when next value is grater
                   min = j;
                }
            }
            //swap min value and set new minimum
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;

        }
    }
}
