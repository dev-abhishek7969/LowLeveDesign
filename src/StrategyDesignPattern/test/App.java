package StrategyDesignPattern.test;

public class App {

	public static void main(String[] args) {
		VehicleClass vc = new SportsCar();
		vc.drive();
		vc.display();

		VehicleClass vc1 = new GeneralVehicle();
		vc1.drive();
		vc1.display();
	}

}
