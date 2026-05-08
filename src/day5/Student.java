package day5;

public class Student {

	String name;
	int age;
	
	// Constructor Overloading
	
	public Student() {
		
		System.out.println("Default Constructor");
		name ="John";  // values are initialized automatically during object creation.
		age = 20;
		
	}
	
	public Student(String n, int a) {
		
		System.out.println("Parameterized Constructor");
		name = n;
		age = a;
	}
	
//	public Student(String n) {
//		
//		
//	}
//	
//	public Student(int a, int b) {
//		
//	}
	
	public void display() {
		System.out.println(name +" " + age);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student obj1 = new Student();
		obj1.age=20;
		obj1.name="John";
		obj1.display();
		
		Student obj = new Student("Arun", 22);
//		obj.name="John";  // Assigning the values manually after object creation 
//		obj.age=20;
		obj.display();
		
		
	}

}
