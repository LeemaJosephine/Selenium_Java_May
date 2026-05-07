package day2;

public class PracticeMethods {

	int a =10;  // non-static or global variable
	int b =20;
	
	static int num1 = 10;  // static variable
	static int num2 = 20;
	
	
	public void add() {   // non-static 
		
		int c = a +b;   // local variable
		System.out.println("The output of addition is : "+c);
	}
	
	public static void sub() {  // static method
		
		int c = num1 - num2;
		System.out.println("The output sub is: " +c);
	}
	
	public void mul() {
		
		int mul = a * b;
		// System.out.println(c);
		System.out.println(mul);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PracticeMethods.sub();  // static method
		
		// To execute Non-Static method
		
		PracticeMethods obj = new PracticeMethods();
		obj.add();
	
		
	}

}
