package Previous_Final_193_2no;

	import java.io.File;
	import java.io.FileWriter;
	import java.io.IOException;
	import java.io.PrintWriter;
	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Scanner;

	class Employee implements Comparable<Employee> {
	    int ID;
	    String name;
	    double salary;

	    Employee(int a, String b, double c){
	        ID = a;
	        name = b;
	        salary = c;
	    }

	    @Override
	    public int compareTo(Employee o) {
	        if (this.salary > o.salary) return -1;
	        if (this.salary < o.salary) return 1;
	        return 0;
	    }

	    public static void main(String[] args) {
	        ArrayList<Employee> Employees = new ArrayList<>();
	        try{
	            Scanner sc = new Scanner(new File("files/employeeDirectory.txt"));

	            while(sc.hasNext()){
	                int ID = sc.nextInt();
	                String name = sc.next();
	                double salary= sc.nextDouble();

	                Employee e = new Employee(ID, name, salary);
	                Employees.add(e);
	            }
	            Collections.sort(Employees);

	        }
	        catch (IOException e){
	            e.printStackTrace();
	        }
	        try{
	            File f = new File("files/output.txt");
	            PrintWriter printWriter = new PrintWriter(f);

	            for(Employee employee: Employees){
	                printWriter.println("Name : "+employee.name+"  ID : "+employee.ID);
	                break;
	            }
	            printWriter.close();
	        }
	        catch (IOException e){
	            e.printStackTrace();
	        }
	    }
	}

