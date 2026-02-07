package AbstractFactory.impl;

public class MacConcreteFactory implements GUIFactory{

	@Override
	public Button createButton() {
		return new MacButton();
	}

	@Override
	public Checkbox createCheckbox() {
		return new MacCheckbox();
	}

}
