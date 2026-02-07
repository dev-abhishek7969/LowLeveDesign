package StrategyDesignPattern.test.strategy.drive;

public class FancyDriveMode implements Drive {

	@Override
	public void drive() {
		System.out.println("Fancy drive mode.");
	}

}
