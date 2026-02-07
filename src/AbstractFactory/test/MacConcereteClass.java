package AbstractFactory.test;

public class MacConcereteClass implements GUIInterface {

	@Override
	public Button createButton() {
		return new MacButton();
	}

	@Override
	public Checkbox createCheckBox() {
		return new MacCheckbox();
	}

}
