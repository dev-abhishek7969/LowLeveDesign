package Singleton.doubleton;

public class Doubleton {

	private static final Doubleton[] instance = new Doubleton[2];
	private static int count = 0;

	private Doubleton() {
		System.out.println("Instance got created.");
	}

	public static Doubleton getInstance() {

		synchronized (Doubleton.class) {
			if (instance[0] == null) {
				instance[0] = new Doubleton();
				return instance[0];
			} else if (instance[1] == null) {
				instance[1] = new Doubleton();
				return instance[1];
			} else {
				return instance[count++ % 2];
			}
		}
	}
}
