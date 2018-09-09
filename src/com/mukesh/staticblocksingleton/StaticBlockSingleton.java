package com.mukesh.staticblocksingleton;

public class StaticBlockSingleton {
private static StaticBlockSingleton instance=null;
private StaticBlockSingleton() {
	
}
static {
	try {
		instance=new StaticBlockSingleton();
	}catch(Exception e) {
		new RuntimeException("Failed to create instance");
	}
}
public static StaticBlockSingleton getInstance() {
	return instance;
}
}
