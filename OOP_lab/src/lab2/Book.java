package lab2;

public class Book {
	private String title, author, publication;
	private int publication_year;

	public Book(String title, String author, String publication, int publication_year) {
		this.title = title;
		this.author = author;
		this.publication = publication;
		this.publication_year = publication_year;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setPublication(String publication) {
		this.publication = publication;
	}

	public void setPublicationYear(int year) {
		this.publication_year = year;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getPublication() {
		return publication;
	}

	public int getPublicationYear() {
		return publication_year;
	}

	public void ShowBook() {
		System.out.println("Book ---------------------------------");
		System.out.println("Title            : " + title);
		System.out.println("Author           : " + author);
		System.out.println("Publication      : " + publication);
		System.out.println("Publication Year : " + this.publication_year);
		System.out.println();
	}
}

