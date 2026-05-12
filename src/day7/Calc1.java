package day7;

import day6.Calculator;

public class Calc1{

	public void add() {
		
		System.out.println("Addition method from calc1");
	}
	
	public void sub() {
		
		System.out.println("Subtraction method from calc1");
	}
	
	public void mul() {
		
		System.out.println("Multiplication method from calc1");
	}
	
	public void div() {
		
		System.out.println("Division method from calc1");
	}
	
	public static void print() {
		
		System.out.println("Welcome to Calculator 1");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calc1 obj = new Calc1();
		obj.add();
		obj.mul();
		obj.div();
		obj.sub();
	}

}
