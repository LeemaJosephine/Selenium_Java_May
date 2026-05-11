package day6;


public class MethodOverloading {

	
	public void print() {
		
		System.out.println("Thank you!");
		
	}
	
	public void print(int num1, int num2) {
		
		System.out.println("The value for num1 is: "+ num1);
		System.out.println("The value for num1 is: "+ num1);
	}
	
	public void print(String name) {
		
		System.out.println("Welcome " +name);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOverloading obj = new MethodOverloading();
		obj.print("Leema");  // Welcome message
		obj.print(20, 30); // print values
		obj.print();  // Print thank you
	}

}
