package day8;

public class ConcreteClass extends AbstractCalculator implements InterfaceCalculator{

	public void add() {
		// TODO Auto-generated method stub
		System.out.println("Addition");
	}
	
	@Override
	public void div() {
		// TODO Auto-generated method stub
		System.out.println("Division Method");
	}

	@Override
	public void mod(int num1, int num2) {
		// TODO Auto-generated method stub
		System.out.println("Mod value is: " +num1%num2);
	}

	@Override
	public void div(int num1, int num2) {
		// TODO Auto-generated method stub
		
		System.out.println("Division: " +num1*num2);
	}

	@Override
	public int avg() {
		// TODO Auto-generated method stub
		return 10;
	}
	
	@Override
	public void mul(int num1, int num2) {
		// TODO Auto-generated method stub
		
		System.out.println("Multiplication: "+ num1*num2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConcreteClass obj = new ConcreteClass();
		obj.add();
		obj.sub(10, 5);
		obj.mul(2, 5);
		obj.div();
		System.out.println(obj.avg());
		obj.mod(10, 2);
	}

	

	
	
}
