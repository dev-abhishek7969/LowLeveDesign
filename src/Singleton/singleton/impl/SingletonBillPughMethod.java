package Singleton.singleton.impl;

public class SingletonBillPughMethod {

	private SingletonBillPughMethod() {
		if (Holder.INSTANCE != null) {
			throw new RuntimeException("Use get instance method.");
		}
	}

	private static class Holder {
		private static final SingletonBillPughMethod INSTANCE = new SingletonBillPughMethod();
	}

	public static SingletonBillPughMethod getInstance() {
		return Holder.INSTANCE;
	}

}
	 