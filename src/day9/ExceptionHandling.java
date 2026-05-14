package day9;

import java.util.Scanner;

public class ExceptionHandling {

	public void calculate() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value for a");
		int a = sc.nextInt();
		System.out.println("Enter the value for b");
		int b = sc.nextInt();
		int result=0;
		int[] arr = {10,20,30,40};
		int arrElement=0;
		String name=null;
		int stringLen=0;
		
		try {
			System.exit(0);
			result = a / b;  // Exception is occured 
			stringLen=name.length();
			
			
		} catch(ArithmeticException e) {
			
			System.out.println("You have entered 0 by mistake so dividing number by 1 as default");
			result = a /1;
			e.printStackTrace(); // to print the exception 
			
		} catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("You are trying to access the element beyond it's index value, so giving the element of the last index");
			arrElement = arr[3];
			e.printStackTrace(); // to print the exception 
			
		} catch (Exception e) {
			
			System.out.println("Using to catch other expetion occured apart from the one specified");
			System.out.println("String is empty");
		}
	
		
		finally {
			System.out.println("From finally block");
		}
		
		System.out.println("The result is: " +result);
		System.out.println("Array element: "+arrElement);
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExceptionHandling obj = new ExceptionHandling();
		obj.calculate();
		
		
	}

}
