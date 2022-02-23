package Final_181_1c;


	import java.io.BufferedReader;
	import java.io.FileReader;
	import java.io.IOException;
	import java.util.Scanner;

	public class SumOfNumber { 
	    public static void main(String[] args) {
	        try {
	            FileReader f = new FileReader("files/numbers.txt");
	            BufferedReader reader = new BufferedReader(f);
	            String line;
	            while ((line = reader.readLine()) != null){
	                String[] val = line.split(",");
	                int a = Integer.parseInt(val[0]);
	                int sum=0;
	                for (int i=0; i<val.length; i++){
	                    sum+= Integer.parseInt(val[i]);
	                    }
	                System.out.println(sum);
	                }
	            }
	        catch (IOException e){
	            e.printStackTrace();
	        }
	    }
	}

