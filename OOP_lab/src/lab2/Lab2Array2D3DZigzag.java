package lab2;

public class Lab2Array2D3DZigzag {
	public static void main(String[] args) {
		// TODO code application logic here
		int[][] matrixA = { { 1, 2, 3, 4 }, { 5, 5, 5, 5 }, { 0, 1, 2, 3 } };
		int[][] matrixB = { { 0, 0, 0, 0 }, { 1, 1, 1, 1 }, { 2, 2, 2, 2 } };
		int[][] matrixSum = new int[3][4];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				matrixSum[i][j] = matrixA[i][j] + matrixB[i][j];
			}
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(matrixSum[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("_________________________________________");

		int[][] zigzagarray = { { 3, 4, 5, 6 }, { 3, 2 }, { 6, 7, 8 } };
		for (int i = 0; i < zigzagarray.length; i++) {
			for (int j = 0; j < zigzagarray[i].length; j++) {
				System.out.print(zigzagarray[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("__________________________________________");
		int[][][] threeDArray = { { { 1, 2, 3, 4 }, { 5, 5, 5, 5 }, { 0, 1, 2, 3 } },
				{ { 0, 0, 0, 0 }, { 1, 1, 1, 1 }, { 2, 2, 2, 2 } } };
		for (int i = 0; i < threeDArray.length; i++) {
			for (int j = 0; j < threeDArray[i].length; j++) {
				for (int k = 0; k < threeDArray[i][j].length; k++) {
					System.out.print(threeDArray[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println("*********");
		}
	}

}
