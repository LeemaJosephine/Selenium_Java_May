package day3;

import java.util.Scanner;

public class CalculatorClass {

	 // 3 variables 
	  
	float result;   // declaration 
	static int res; 
	
	// Methods to perfome operation
	
	public void display() {
		
		System.out.println("Welcome to the calculator app");
		System.out.println("------------------------------");
	}
	
	public float addition(int num1, float num2) {   // receive the arguments
		
		result = num1 + num2;  // num1 and num2 are local variable in this case
		return result; // method return statement   this should be the last statement
	}
	
	public void subtraction(int a, int b) {
		
		result = a - b;
		System.out.println("The subtraction result: " +result);
	}
	
	public void multiplication(int i,int j) {
		
		result = i * j;
		System.out.println("The multiplication result: " +result);
	}
	
	public static int division(int x, int y) {
		
		res = x + y;
		System.out.println("The division result: " +res);
		return res;
	}
	
	public String message() {
		
		return "End of Program";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CalculatorClass obj = new CalculatorClass();
		obj.display();
		
		// Get the value from user using Scanner class
		
		Scanner sc = new Scanner(System.in);  // define
		
		System.out.println("Enter the value for num1");
		int num1 = sc.nextInt();  // read integer
		
		System.out.println("Enter the value for num2");
		float num2 = sc.nextFloat(); // read float
		
//		double value = sc.nextDouble();  // read double
//		String text = sc.nextLine(); // read string
//		short short_value = sc.nextShort(); // read short value
		
		
		float end_result = obj.addition(num1,num2);   // passing the value/parameter and returning the result
		System.out.println("The addition result: " +end_result);
		
		float res = end_result + 10;   // extra logic 
		System.out.println("The updated result with additional 10: " +res);
		
		obj.subtraction(30,10);
		obj.multiplication(2,5);
		
		int div = division(10, 2);  // print the output and return the value
		int div_updated = div + 10;
		System.out.println("The updated division result with additional 10: " +div_updated );
		
		System.out.println(obj.message());  // calling method in print statement
	}

}
