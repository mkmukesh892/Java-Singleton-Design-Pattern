package com.mukesh.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SingletonSerializedTest {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		SerializedSingleton instanceOne=SerializedSingleton.getInstance();
		ObjectOutput out=new ObjectOutputStream(new FileOutputStream("C:\\logs\\log5.log"));
		out.writeObject(instanceOne);
		out.close();
		
		//deSerialize from file to object
		ObjectInput in=new ObjectInputStream(new FileInputStream("C:\\logs\\log5.log"));
		SerializedSingleton instanceTwo=(SerializedSingleton) in.readObject();
		in.close();
		System.out.println("instanceOne hashCode= "+instanceOne.hashCode());
		System.out.println("instanceTwo hashCode= "+instanceTwo.hashCode());
	}

}
