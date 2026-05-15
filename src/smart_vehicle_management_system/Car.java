package smart_vehicle_management_system;

public class Car extends Vehicle implements Service {

	Car(String brand, int speed) {
		super(brand, speed);  // represents the parent class variables 
		// TODO Auto-generated constructor stub
	}

	@Override
	public void serviceReport() {
		// TODO Auto-generated method stub
		
		System.out.println("Car Service report Completed Sucessfully");
	}

	@Override
	void startVehicle() {
		// TODO Auto-generated method stub
		
		System.out.println(brand + " Car starts using Push Button");
	}

	
	
}
