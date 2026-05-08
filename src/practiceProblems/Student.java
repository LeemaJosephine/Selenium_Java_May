package practiceProblems;

import java.util.Scanner;

public class Student {

	String studentName;
	int studentId;
	int marks;
	
	public void displayDetails() {
		
		System.out.println("Student Details");
		System.out.println("Name : "+studentName);
		System.out.println("ID : "+studentId);
		System.out.println("Marks : "+marks);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student obj = new Student();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Name: ");
		obj.studentName = sc.next();
		System.out.println("Enter Student ID:");
		obj.studentId = sc.nextInt();
		System.out.println("Enter Marks:");
		obj.marks = sc.nextInt();
		
		obj.displayDetails();
	}

}
