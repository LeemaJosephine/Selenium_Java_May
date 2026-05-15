package smart_vehicle_management_system;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Runtime Polymorphism
		
		Vehicle obj1 = new Car("Hyundai", 180);  // Parent class reference holding child class object
		Vehicle obj2 = new Bike("Ntorq", 150);
		
		System.out.println("====CAR DETAILS======");
		obj1.displayinfo();
		obj1.startVehicle();
		
		System.out.println("====BIKE DETAILS======");
		obj2.displayinfo();
		obj2.startVehicle();
		
		System.out.println();
		
		// Interface reference
		Service v1 = new Car("Honda", 160);
		v1.serviceReport();
		
		System.out.println();
		
		Service v2 = new Bike("Yamaha", 110);
		v2.serviceReport();
		
		
	}

}
