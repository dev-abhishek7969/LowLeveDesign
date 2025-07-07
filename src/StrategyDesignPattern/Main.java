package StrategyDesignPattern;

public class Main {

	public static void main(String[] args) {

		Vehicle v1 = new OffRoadVehicle();
		v1.drive();

		Vehicle v2 = new SportsVehicle();
		v2.drive();

		Vehicle v3 = new GoodsVehicle();
		v3.drive();

	}

}
