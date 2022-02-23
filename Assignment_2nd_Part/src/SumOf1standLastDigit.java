
import java.util.Scanner;

public class SumOf1standLastDigit {

	public static void main(String argc[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
		int number = sc.nextInt();

		int firstDigit = 0;
		int lastDigit = 0;

		lastDigit = number % 10;

		while (number != 0) {
			firstDigit = number % 10;
			number /= 10;
		}

		System.out.println("First digit: " + firstDigit);
		System.out.println("Last digit: " + lastDigit);
		int Sum = firstDigit + lastDigit;
		System.out.println("Sum of the first and last number: "+Sum);
	}
}
