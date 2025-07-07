package StrategyDesignPattern;

import StrategyDesignPattern.strategy.OtherXYXDriveStrategy;

public class OffRoadVehicle extends Vehicle {

	public OffRoadVehicle() {
		super(new OtherXYXDriveStrategy());
	}

}
