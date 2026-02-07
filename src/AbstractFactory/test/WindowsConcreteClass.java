package AbstractFactory.test;

public class WindowsConcreteClass implements GUIInterface {

	@Override
	public Button createButton() {
		return new WindowsButton();
	}

	@Override
	public Checkbox createCheckBox() {
		return new WindowsCheckbox();
	}

}
