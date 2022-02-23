public class PrimeNum {

	public static void main(String[] args) {
		   
		
	      int count = 1;
	      int num = 3;
	      System.out.println("First 50 prime numbers are:");   
	      System.out.println(2);
	      for ( int i = 2 ; i <=50 ; )
	      {
	         for ( int j = 2 ; j <= Math.sqrt(num) ; j++ )
	         {
	            if ( num%j == 0 )
	            {
	               count = 0;
	               break;
	            }
	         }
	         if ( count != 0 )
	         {
	            System.out.println(num);
	            i++;
	         }
	         count = 1;
	         num++;
	      }         
	   }
	}