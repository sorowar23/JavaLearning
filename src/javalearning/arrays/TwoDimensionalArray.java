package javalearning.arrays;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[][] = { {2,6,8}, {5,6,7}, {9,4,3}, {10,12,15} };
		for(int i = 0; i<4; i ++) { //for row
			for(int j = 0; j<3; j++) { //for column
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

}
