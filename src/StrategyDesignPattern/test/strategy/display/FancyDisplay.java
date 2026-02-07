package StrategyDesignPattern.test.strategy.display;

public class FancyDisplay implements DisplayStrategy {

	@Override
	public void display() {
		System.out.println("Fancy display.");
	}
}
