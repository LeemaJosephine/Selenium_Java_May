package day3;

import day4.Demo; // from where the class is coming

public class AccessVariablesOfAnotherClass extends Demo{   // inheritance

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo obj = new Demo();
		obj.number=10;
		obj.show();
		
		AccessVariablesOfAnotherClass obj1 = new AccessVariablesOfAnotherClass();  // sub class
		obj1.show1();  // accessing the protected method of another class
		
	}

}
