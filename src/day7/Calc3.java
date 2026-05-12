package day7;

public class Calc3 extends Calc2{

	public void cos() {
		
		System.out.println("Cos method from Calc3");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calc3 obj = new Calc3();
		print();
		obj.add();
		obj.sub();
		obj.mul();
		obj.div();
		obj.mod();
		obj.cos();
	}

}
