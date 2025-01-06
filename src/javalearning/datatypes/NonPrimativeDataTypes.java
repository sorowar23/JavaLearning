package javalearning.datatypes;

public class NonPrimativeDataTypes {

	public static void main(String[] args) {
		
		String str = "Test"; //string will re-use same Obj multipple times
		System.out.println("String is:" + str);
		
		String str1 = new String("Test"); // String will create new Obj every time you call
		System.out.println("Another string: "+ str1);
		
		int arr[]; // array is a Non primative homoginius data stucture type in java because can store same type data 
		arr = new int[2];
		
		//int array [] = new int[5];
		
		arr[0] = 3;
		arr[1] = 4;
		//arr[2] = 2;
		
		System.out.println(arr);
		System.out.println(arr[0]);
		
	}

}
