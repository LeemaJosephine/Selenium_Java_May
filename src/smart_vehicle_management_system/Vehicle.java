package smart_vehicle_management_system;

public abstract class Vehicle {

	String brand;
	int speed;
	
	// Constructor
	Vehicle(String brand, int speed){
		
		this.brand = brand;
		this.speed = speed;
	}
	
	// Abstract Method
	abstract void startVehicle();
	
	// Normal method
	void displayinfo() {
		
		System.out.println("Brand: " +brand);
		System.out.println("Speed: " +speed);
	}
}
