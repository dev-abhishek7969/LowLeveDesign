package StrategyDesignPattern.test.strategy.drive;

public class NormalDriveMode implements Drive {

	@Override
	public void drive() {
		System.out.println("Normal drive mode.");
	}

}
