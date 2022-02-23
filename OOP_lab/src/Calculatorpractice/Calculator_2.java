package Calculatorpractice;

import java.util.Scanner;

public class Calculator_2 {

    public static void main(String[] args) {
        CalculatorTest c = new CalculatorTest("Casio", 1981);
        c.showInformation();

        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter the two numbers: ");

        System.out.println("" + c.AddInt(sc.nextInt(), sc.nextInt()));

    }

}
class CalculatorTest {

    private String brand;
    private int manufacturingYear;

    public CalculatorTest() {

    }

    public CalculatorTest(String brand, int manufacturingYear) {

        this.brand = brand;
        this.manufacturingYear = manufacturingYear;

    }

    public int AddInt(int a, int b) {

        return a + b;
    }

    public void showInformation() {

        System.out.println(".......Calculator.........");
        System.out.println("Brand: " + this.brand);
        System.out.println("Manufecturing Year: " + this.manufacturingYear);
    }
}