package StrategyDesignPattern.strategy;

public class OtherXYXDriveStrategy implements DriveStrategy {

	@Override
	public void drive() {
		System.out.println("Other drive capability can be added here !!");
	}

}
