package StrategyDesignPattern.impl;

import StrategyDesignPattern.impl.strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle {

	public SportsVehicle() {
		super(new SportsDriveStrategy());
	}

}
