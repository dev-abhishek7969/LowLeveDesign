package StrategyDesignPattern.test;

import StrategyDesignPattern.test.strategy.display.NormalDisplay;
import StrategyDesignPattern.test.strategy.drive.NormalDriveMode;

public class GeneralVehicle extends VehicleClass{

	public GeneralVehicle() {
		super(new NormalDisplay(), new NormalDriveMode());
	}}
