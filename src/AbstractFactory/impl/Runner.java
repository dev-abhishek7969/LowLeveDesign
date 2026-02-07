package AbstractFactory.impl;

public class Runner {

	public static void main(String[] args) {

		GUIFactory factory;

		String os = "MAC1";

		if (os.equalsIgnoreCase("MAC")) {
			factory = new MacConcreteFactory();
		} else {
			factory = new WindowsConcreteFactory();
		}

		factory.createButton().paint();
		factory.createCheckbox().paint();

	}

}
