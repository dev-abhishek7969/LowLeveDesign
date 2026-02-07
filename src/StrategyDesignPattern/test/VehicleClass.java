package StrategyDesignPattern.test;

import StrategyDesignPattern.test.strategy.display.DisplayStrategy;
import StrategyDesignPattern.test.strategy.drive.Drive;

public abstract class VehicleClass {
	protected DisplayStrategy displayStrategy;

	protected Drive driveStrategy;

	public void drive() {
		driveStrategy.drive();
	}

	public VehicleClass(DisplayStrategy displayStrategy, Drive driveStrategy) {
		super();
		this.displayStrategy = displayStrategy;
		this.driveStrategy = driveStrategy;
	}

	public void display() {
		displayStrategy.display();
	}

	
}
