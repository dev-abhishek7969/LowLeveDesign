package Singleton.singleton.impl;

import java.io.Serializable;

public class SingletonWithSerialization implements Serializable {
	private static final long serialVersionUID = 1L;

	private static SingletonWithSerialization instance;

	private SingletonWithSerialization() {
	}

	public static SingletonWithSerialization getInstance() {
		if (instance == null) {
			instance = new SingletonWithSerialization();
		}
		return instance;
	}

	// 🔑 Prevent breaking Singleton during deserialization
	protected Object readResolve() {
		return getInstance();
	}

}
