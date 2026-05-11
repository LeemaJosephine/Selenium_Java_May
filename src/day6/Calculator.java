package day6;

public class Calculator {

	int a;
	int b;
	int c;
	int result;
	
	public void add(int num1, int num2) {
		
		// This is method does addition with 2 numbers
		a = num1;
		b = num2;
		result = a + b;
		System.out.println("The addition of two numbers is: " +result);
	}
	
	public void add(int num1, int num2, int num3) {
		
		a = num1;
		b = num2;
		c = num3;
		result = a + b + c;
		System.out.println("The addition of three numbers is: " +result);
	}
	
	public void subtraction(int num1, int num2) {
		
		a = num1;
		b = num2;
		result = num1 - num2;
		System.out.println("The subtraction of 2 number: "+ result);
	}
	
	public void multiplucation(int num1, int num2) {
		
		a = num1;
		b = num2;
		result = num1 * num2;
		System.out.println("The multiplication of 2 numbers is "+result);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator obj = new Calculator();
		obj.add(10, 20);  // 2 number addition
		//obj.add(10, 20, 10);  // 3 number addition
		obj.subtraction(20, 10);
		obj.multiplucation(2, 5);
	}

}
