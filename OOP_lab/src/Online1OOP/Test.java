package Online1OOP;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Library UIULibrary = new Library("A. A. Khan", 6);
		Library NSULibrary = new Library();
		System.out.println("Provide NSU Librarian Name : ");
		NSULibrary.setNameOfLibrarian(scanner.nextLine());
		System.out.println("Provide NSU Number of Books: ");
		NSULibrary.setNumberOfBooks(scanner.nextInt());
		UIULibrary.PrintAboutLibrary();
		NSULibrary.PrintAboutLibrary();
		for (int i = 0; i < 8; i++) {
			UIULibrary.LendBook();
			NSULibrary.LendBook();
			UIULibrary.PrintAboutLibrary();
			NSULibrary.PrintAboutLibrary();
		}
		
			for (int i1 = 0; i1 < 5; i1++) {
				UIULibrary.GiveBackBook();
				NSULibrary.GiveBackBook();
				UIULibrary.PrintAboutLibrary();
				NSULibrary.PrintAboutLibrary();
			}
		}
	}

