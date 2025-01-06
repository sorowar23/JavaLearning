package javalearning.loops;

public class EnhancedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers = {1,2,3,5,6,7,8,9,10}; // for enhanced for loop can use arrays, list, map, set etc collections
		
		for(int item : numbers) {
			System.out.println("Count is:"+ item);
		}

	}

}
