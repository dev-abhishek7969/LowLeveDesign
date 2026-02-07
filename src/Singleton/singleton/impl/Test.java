package Singleton.singleton.impl;

import java.lang.reflect.Constructor;

public class Test {

	public static void main(String[] args) throws Exception{
		SingletonBillPughMethod s1 = SingletonBillPughMethod.getInstance();

		Constructor<SingletonBillPughMethod> constructor = SingletonBillPughMethod.class.getDeclaredConstructor();
		constructor.setAccessible(true); 
		SingletonBillPughMethod s2 = constructor.newInstance();

	}

}
