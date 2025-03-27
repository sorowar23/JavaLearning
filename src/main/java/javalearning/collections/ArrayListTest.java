package javalearning.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<Integer> arrayList = new ArrayList<>(4);
		
		//add - Example
		for(int i = 0; i<= 5; i++) 
			arrayList.add(i);
		
		//remove - Example
		System.out.println(arrayList);
		arrayList.remove(2);
		
		System.out.println(arrayList);
		
		//get and size - Example
		for(int i = 0; i< arrayList.size(); i++) {
			System.out.print(arrayList.get(i)+" ");
		}
		
		System.out.println("\n set Example: ");
		
		//set Example
		arrayList.set(3, 10);
		
		for(int item:arrayList) {
			System.out.print(item+ " ");
		}
		
		 
		//clone example
		 ArrayList<Integer> clonelist = new ArrayList<>(); 
		 clonelist = (ArrayList)arrayList.clone();
		 
		// clear - Example
		arrayList.clear();
		System.out.println();
		System.out.println("First Arraylist: "+arrayList);
		System.out.println();
		System.out.println("Cloned List:"+clonelist);
		
		List<String> carList = new ArrayList<>();
		
		carList.add("Toyota");
		carList.add("BMW");
		carList.add("Lexus");
		carList.add("Marcedise");
		carList.add("Nisan");
		
		//sort Example
		Collections.sort(carList);
		
		for(String car: carList)
			System.out.println(car);
		
		List<String> trainList = new ArrayList<>();
		
		trainList.add("CN");
		trainList.add("NS");
		trainList.add("BSNF");
		
		//addAll Example
		//carList.addAll(trainList);
		carList.addAll(2, trainList);
		System.out.println();
		System.out.println("New carlist after adding all elemnts form Train List:"+ carList);
		
		//contain Example
		System.out.println(carList.contains("CN"));
		
		int p = carList.indexOf("CN");
		System.out.println("\nThe element CN is at index: " + p);
		//ListIterator - Example
		//ListIterator for traversing the elements of the list in proper sequence. The iterator allows both forward and backward traversal of the list.
		
		ListIterator<String> carsBrands = carList.listIterator();
		
		System.out.println("Iterating through the list:");
		
		while(carsBrands.hasNext()) {
			System.out.println(carsBrands.next());
		}
		
		ListIterator<String> trainBrand = trainList.listIterator(1);
		System.out.println("Iterating through for Train Brand list:");
		
		while(trainBrand.hasNext()) {
			System.out.println(trainBrand.next());
		}
		
		//toArray() - example
		System.out.println("---Start -- toArray() Example--");
		List<String> clothBrandsList = new ArrayList<>();
		
		clothBrandsList.add("H&M");
		clothBrandsList.add("Tamy Hillfigure");
		clothBrandsList.add("Nike");
		clothBrandsList.add("Addidus");
		
		Object[] objects = clothBrandsList.toArray();
		
		for(Object obj : objects) {
			System.out.println(obj);
		}
	}
	
	
	

}
