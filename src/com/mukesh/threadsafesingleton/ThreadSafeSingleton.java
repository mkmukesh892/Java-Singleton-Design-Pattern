package com.mukesh.threadsafesingleton;

//import com.mukesh.lazyinitializationsingleton.LazyIntializationSingleton;

public class ThreadSafeSingleton {
	private static ThreadSafeSingleton instance=null;
	private ThreadSafeSingleton() {
		
	}
	public static synchronized ThreadSafeSingleton getInstance() {
		if(instance==null) {
			instance=new ThreadSafeSingleton();
		}
		return instance;
	}
	//double locking method
	public static ThreadSafeSingleton getInstanceUsingDoubleLock() {
		if(instance==null) {
			synchronized (ThreadSafeSingleton.class) {
				if(instance==null) {
					instance=new ThreadSafeSingleton();
				}
			}
		}
		return instance;
	}
}
