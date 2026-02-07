package StrategyDesignPattern.test;

import StrategyDesignPattern.test.strategy.display.FancyDisplay;
import StrategyDesignPattern.test.strategy.drive.FancyDriveMode;

public class SportsCar extends VehicleClass {

	public SportsCar() {
		super(new FancyDisplay(), new FancyDriveMode());
	}
}
