package DecoratorDesignPattern.decorator;

import DecoratorDesignPattern.BasePizza;

public class Mushroom extends ToppingDecorator {

	private BasePizza basePizza;

	public Mushroom(BasePizza pizza) {
		this.basePizza = pizza;
	}

	@Override
	public int cost() {

		return this.basePizza.cost() + 55;
	}

}
