package day8;

public class ConcreteClassForInterface implements InterfaceCalculator {

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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConcreteClassForInterface obj = new ConcreteClassForInterface();
		obj.div();
		obj.div(10, 2);
		obj.mod(10, 2);
		int result = obj.avg();
		System.out.println(result);
		obj.add();
		
	}
}
