package com.mukesh.lazyinitializationsingleton;

public class LazyIntializationSingleton {
private static LazyIntializationSingleton instance=null;
private LazyIntializationSingleton() {
	
}
public static LazyIntializationSingleton getInstance() {
	if(instance==null) {
		instance=new LazyIntializationSingleton();
	}
	return instance;
}
}
