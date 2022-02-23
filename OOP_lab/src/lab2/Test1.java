package lab2;

public class Test1 {

		public static void main(String[] args) {
			// TODO code application logic here
			Book book = new Book("Java", "Dietel", "Amazon", 2021);
			// book.setPublication("Kindle");
			book.ShowBook();
			book.setAuthor("Danis Ritchie");
			System.out.println("How to get CG-4.");
			book.ShowBook();
		}

	}
