package DecoratorDesignPattern;

import DecoratorDesignPattern.decorator.ExtraChesse;

public class Main {

	public static void main(String[] args) {

		BasePizza farmhosePizza = new Farmhouse();
		
		System.out.println("Farmhouse pizza cost is = "+farmhosePizza.cost());
		
		
		System.out.println("Farmhose pizza with extra cheese = "+ new ExtraChesse(farmhosePizza).cost());
		
		System.out.println("Farmhose pizza with double extra cheese = "+ new ExtraChesse(new ExtraChesse(farmhosePizza)).cost());
		
		
	}

}
