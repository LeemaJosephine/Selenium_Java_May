package day8;

public interface InterfaceCalculator {

	int num1 = 0;
	int num2 = 0; 
	
	void div();
	
	void mod(int num1, int num2);
	
	void div(int num1, int num2);
	
	int avg();
	
	default void add() {
		System.out.println("Implemented methods are available with keyword default in interface");
	}
}
