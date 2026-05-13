package day8;

public abstract class AbstractCalculator {

	int num1;
	int num2; 
	int result;
	
	public abstract void add();
	
	public void sub(int a, int num2) {
		
		num1 = a;  
		this.num2 = num2;  // "this" keyword is used to differentiate between global variable and local variable
		result = num1 - num2;
		System.out.println("The subtraction value is: "+result);
	}
	
	public abstract void mul(int num1, int num2);
	
	
}
