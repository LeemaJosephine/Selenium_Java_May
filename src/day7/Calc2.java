package day7;

public class Calc2 extends Calc1{

	public void mod() {
		
		System.out.println("Mod from Calc2");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calc2 obj = new Calc2();
		print();
		obj.add();
		obj.sub();
		obj.mul();
		obj.div();
		obj.mod();
	
	}

}
