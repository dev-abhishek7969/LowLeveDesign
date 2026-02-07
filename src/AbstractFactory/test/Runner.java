package AbstractFactory.test;

public class Runner {

	public static void main(String[] args) {

		GUIInterface guiInterface;

		String OS = "MAC";

		if (OS.equalsIgnoreCase("MAC")) {
			guiInterface = new MacConcereteClass();
		} else {
			guiInterface = new WindowsConcreteClass();
		}

		guiInterface.createCheckBox().paint();
		guiInterface.createButton().paint();

	}

}
