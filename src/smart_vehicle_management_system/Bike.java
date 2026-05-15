package smart_vehicle_management_system;

public class Bike extends Vehicle implements Service{

	Bike(String brand, int speed) {
		super(brand, speed);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void serviceReport() {
		// TODO Auto-generated method stub
		
		System.out.println("Bike Service report Completed Sucessfully");
	}

	@Override
	void startVehicle() {
		// TODO Auto-generated method stub
		
		System.out.println(brand + " Bike starts using Self Start");
	}

	
}
