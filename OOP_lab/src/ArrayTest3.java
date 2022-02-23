public class ArrayTest3 {

	public static void main(String[] args) {
		int arr[][] = { { 1, 3, 5 }, { 7, 9, 11 }, { 13, 15, 17 } };
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();

		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
		int b[][] = { { 2, 4, 6 }, { 8, 10, 12 } };

		int c[][] = new int[2][3];
		{
			for (int k = 0; k < 2; k++) {
				for (int i1 = 0; i1 < 3; i1++) {
					c[k][i1] = a[k][i1] + b[k][i1];
					System.out.print(c[k][i1] + " ");
				}
				System.out.println();
			}
		}
	}
}