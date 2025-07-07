package StrategyDesignPattern;

import StrategyDesignPattern.strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle {

	public GoodsVehicle() {
		super(new NormalDriveStrategy());
	}

}
