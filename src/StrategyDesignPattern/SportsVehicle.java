package StrategyDesignPattern;

import StrategyDesignPattern.strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle {

	public SportsVehicle() {
		super(new SportsDriveStrategy());
	}

}
