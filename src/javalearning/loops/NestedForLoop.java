package javalearning.loops;

public class NestedForLoop {

	public static void main(String[] args) {
		
		int array[][] = { {2,5,8,6}, {9, 10, 13, 5}, {7, 4, 8, 11} };
		
		for(int i = 0; i<3; i++) {
			
			for(int j = 0; j<4; j++) {
				System.out.print(array[i][j]+ " ");
			}
			
			System.out.println();
		}
		
	}

}
