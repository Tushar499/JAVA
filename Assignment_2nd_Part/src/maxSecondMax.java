public class maxSecondMax {
	public static void main(String[] args) {
		int[] array = { 7, 2, 90, 23, 54, 89 };
		int max = array[0], second_max = array[0];
		int min = array[0], second_min = array[0];

		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				second_max = max;
				max = array[i];
			} else if (array[i] > second_max) {
				second_max = array[i];
			}
			if (array[i] < min) {
				second_min = min;
				min = array[i];
			} else if (array[i] < second_min) {
				second_min = array[i];
			}
			System.out.println("Max: " + max);
			System.out.println("Second Max : " + second_max);
			System.out.println("Min: " + min);
			System.out.println("Second Min : " + second_min);

		}
	}
}
