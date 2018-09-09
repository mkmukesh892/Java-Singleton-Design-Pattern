package com.mukesh.eagerInitialization;

//import com.sun.org.apache.regexp.internal.recompile;

public class EagerIntializedSingleton {
private EagerIntializedSingleton() {}
private static final EagerIntializedSingleton instance=new EagerIntializedSingleton();
public static EagerIntializedSingleton getInstance() {
	return instance;
}
}
