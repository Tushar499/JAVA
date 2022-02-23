package File;

	//import java.io.File;
	import java.io.FileWriter;
	import java.io.IOException;
	import java.io.PrintWriter;

	class PrintWriterTest {
	    public static void main(String[] args) {
	        try {
//	            File f = new File("files/b.txt");

	            FileWriter f = new FileWriter("files/b.txt", true);
	            PrintWriter out = new PrintWriter(f);

	            out.println("abc");
	            out.println(123);
	            out.println(5.556);

	            out.close();
	        }
	        catch (IOException e){
	            e.printStackTrace();
	        }
	    }
	}


