package DecoratorDesignPattern.decorator;

import DecoratorDesignPattern.BasePizza;

public class ExtraChesse extends ToppingDecorator {

	private BasePizza basePizza;

	public ExtraChesse(BasePizza pizza) {
		this.basePizza = pizza;
	}

	@Override
	public int cost() {
		return this.basePizza.cost() + 21;
	}

}
