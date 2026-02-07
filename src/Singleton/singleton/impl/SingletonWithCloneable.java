package Singleton.singleton.impl;

public class SingletonWithCloneable implements Cloneable {

	private static SingletonWithCloneable instance;

	public static SingletonWithCloneable getInstance() {
		if (instance == null) {
			instance = new SingletonWithCloneable();
		}
		return instance;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		//return super.clone(); // will result in new object
		return instance;  // solution return the same instance
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		SingletonWithCloneable s1 = SingletonWithCloneable.getInstance();
		SingletonWithCloneable s2 = (SingletonWithCloneable) s1.clone(); // creates a NEW instance

		System.out.println(s1 == s2); // false //true if same instance is returned in overridden clone method🚨
	}

}
