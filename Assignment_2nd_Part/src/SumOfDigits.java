import java.util.Scanner;
public class SumOfDigits {
	
	
	    public static void main(String args[])
	    {
	        int n,x,sum = 0;
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the number:");
	        x = sc.nextInt();
	        while(x > 0)
	        {
	            n = x % 10;
	            sum = sum + n;
	            x = x / 10;
	        }
	        System.out.println("Sum of Digits:" +sum);
	    }
   }
