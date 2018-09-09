package com.mukesh.reflectionsingletontest;


import java.lang.reflect.Constructor;

import com.mukesh.eagerInitialization.EagerIntializedSingleton;

public class ReflectionSingletonTest {

	public static void main(String[] args) {
		EagerIntializedSingleton instanceOne=EagerIntializedSingleton.getInstance();
		EagerIntializedSingleton instanceTwo=null;
		try {
			Constructor[] constructors=EagerIntializedSingleton.class.getDeclaredConstructors();
			for(Constructor constructor:constructors) {
				constructor.setAccessible(true);
				instanceTwo=(EagerIntializedSingleton) constructor.newInstance();
				break;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(instanceOne.hashCode());
		System.out.println(instanceTwo.hashCode());
	}

}
