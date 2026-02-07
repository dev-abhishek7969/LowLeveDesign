package Singleton.singleton.impl;

public class SingletonDoubleCheck {

	private static volatile SingletonDoubleCheck instance;

	private SingletonDoubleCheck() {
		if (instance != null) {
			throw new RuntimeException("Use getInstance() method.");
		}
	}

	public static SingletonDoubleCheck getInstance() {
		if (instance == null) {
			synchronized (SingletonDoubleCheck.class) {
				if (instance == null) {
					instance = new SingletonDoubleCheck();
				}
			}
		}
		return instance;
	}
}
