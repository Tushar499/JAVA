package Online1OOP;

public class Library {
	private String NameOfLibrarian;
	private int NumberOfBooks;

	public Library() {

	}

	public Library(String NameOfLibrarian, int NumberOfBooks) {
		this.NameOfLibrarian = NameOfLibrarian;
		this.NumberOfBooks = NumberOfBooks;
	}

	public String getNameOfLibrarian() {
		return NameOfLibrarian;
	}

	public void setNameOfLibrarian(String nameOfLibrarian) {
		NameOfLibrarian = nameOfLibrarian;
	}

	public int getNumberOfBooks() {
		return NumberOfBooks;
	}

	public void setNumberOfBooks(int numberOfBooks) {
		NumberOfBooks = numberOfBooks;
	}

	public void PrintAboutLibrary() {
		System.out.println("UIU Library------------------------");
		System.out.println("Name of Librarian :" + this.NameOfLibrarian);
		System.out.println("Number of books here :" + this.NumberOfBooks);
		}


		public void LendBook() {
			if (NumberOfBooks > 0) {

			NumberOfBooks--;

			System.out.println("One Book Lended");

			} else {
			System.out.println("No Books there.");
			}
			

			}
	
	public void GiveBackBook() {
		NumberOfBooks++;
		System.out.println("One Book Return");

	}

}