package movie;

public class Titanic {
	String directorName;
	String featuredSong;

	public Titanic(String n, String m) {
		this.directorName = n;
		this.featuredSong = m;
		System.out.println("Instance Vaaiables are: " + directorName + featuredSong);
	}

	void showDetails() {
		System.out.println("Titanic sank in the North Atlantic Ocean on15 April 1912 afterstriking an iceberg.");

	}

	public static void main(String[] args) {

		Titanic t = new Titanic("James Cameron", "My Heart Will Go On");
		t.showDetails();

	}
}
