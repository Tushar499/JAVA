package Calculatorpractice;

class Calculator {
	    private String brand;
	    private int manufacturingYear;
	    
	    public Calculator(){
	        
	    }
	    
	    public Calculator(String brand, int year){
	        this.brand = brand;
	        this.manufacturingYear = year;
	    }
	    int c;
	    public int AddInt(int a, int b){
	        return a+b;
	    }
	    public void ShowInformation(){
	        System.out.println("------------CALCULATOR------------");
	        System.out.println("Brand              : "+brand);
	        System.out.println("Manufacturing Year : "+manufacturingYear);
	     
	       
	    }
	}

//class C1 {
//	
//
//    public static void main(String[] args) {
//        // TODO code application logic here
//        Calculator calculator = new Calculator("CASIO", 2020);
//        calculator.ShowInformation();
//        System.out.println(""+calculator.AddInt(12,15));
//        
//        
//    }
//    
//}
