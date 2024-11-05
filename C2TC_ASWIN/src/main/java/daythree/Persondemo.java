package daythree;

import java.util.Scanner;

public class Persondemo {

	public static void main(String[] args) {
	  	Scanner ob = new Scanner(System.in); 
	  	String name; 
	  	System.out.println("Enter Person Name :"); 
	  	name = ob.next(); 
	  	System.out.println("Enter age: "); 
	  	int age = ob.nextInt(); 
	  	System.out.println("Enter gender: "); 
	  	String gender = ob.next(); 
	  	System.out.println("Enter taxable income:");  
	  	int income = ob.nextInt(); 
	 
	  person person = new person();  
	  person.setName(name);  
	  person.setAge(age);  
	  person.setGender(gender); 
	  person.setIncome(income); 
	   
	  System.out.println(person); 
	  taxcalculation calc = new taxcalculation(); 
	  calc.calculateTax(person);
	  System.out.println("After calculating tax : "); 
	  System.out.println(person); 
	 
	  ob.close(); 
	 } 
	}
