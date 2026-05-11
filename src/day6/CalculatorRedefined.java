package day6;

public class CalculatorRedefined extends Calculator {
	
	
	// Overriding the method - rewriting 
	public void add(int num1, int num2) {
		
		a = num1;
		b = num2;
		result = a + b + 1;
		System.out.println("The addition of 2 numnbers along with 1: "+result);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CalculatorRedefined obj = new CalculatorRedefined();
		obj.add(10, 20);
		obj.subtraction(20, 10);
		obj.multiplucation(2, 5);
	}

}
