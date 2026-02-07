package StrategyDesignPattern.impl;

import StrategyDesignPattern.impl.strategy.OtherXYXDriveStrategy;

public class OffRoadVehicle extends Vehicle {

	public OffRoadVehicle() {
		super(new OtherXYXDriveStrategy());
	}

}
