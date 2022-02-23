package Final_182_3a;


	import java.util.*;
	public class Main
	{
	 public static void main(String[] args) {
	  String username;
	     Scanner sc = new Scanner (System.in);
	   System.out.print("Enter your name: ");
	   username = sc.nextLine();
	   System.out.print("Enter the number of times you want to display your name: ");
	   int n = sc.nextInt();
	   
	  for(int i= 0; i<n; i++){
	      System.out.println(username);
	  }
	 }
	}

