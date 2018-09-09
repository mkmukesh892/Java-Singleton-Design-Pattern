package com.mukesh.billpughsingleton;

public class BillPughSingleton {
//private static BillPughSingleton instance=null;
private BillPughSingleton() {
	
}
private static class SingletonHelper{
	private static BillPughSingleton INSTANCE=new BillPughSingleton();
}
public static BillPughSingleton getInstance() {
	return SingletonHelper.INSTANCE;
}
}
