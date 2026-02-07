package StrategyDesignPattern.impl;

import StrategyDesignPattern.impl.strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle {

	public GoodsVehicle() {
		super(new NormalDriveStrategy());
	}

}
