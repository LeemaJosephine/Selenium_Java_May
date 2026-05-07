package day4;

public class Demo {

	public int number =10;
	private int num2;
	int num3;  // default  access
	protected int num4;
	
	
	public void show() {
		System.out.println("Public method");
	}
	
	private void display() {
		System.out.println("Private Method");
	}
	
	void display1() {
		System.out.println("Default method");
	}
	
	protected void show1() {
		System.out.println("Protected method");
	}

	
	public static void main(String[] args) {   // java execution starts here 
		// TODO Auto-generated method stub

		Demo obj = new Demo();  
		
		System.out.println(obj);
		
	}

}
