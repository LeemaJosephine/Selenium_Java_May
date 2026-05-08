package day5;

public class ConstructorPractice {

	public ConstructorPractice() {
		
		System.out.println("Inside Constructor");
	}
	
	public void normal_method() {
		
		System.out.println("Normal method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstructorPractice obj = new ConstructorPractice();
		obj.normal_method();
		
		
	}

}
