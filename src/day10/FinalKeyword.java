package day10;

public class FinalKeyword {

	final int x = 10;
	static final int z = 10;
	
	void display() {
		 // x = 20; // Error
		 
		 final int y = 10;
		 // y = 20;
		 
		 //z = 20;
		 
		System.out.println(x);
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
