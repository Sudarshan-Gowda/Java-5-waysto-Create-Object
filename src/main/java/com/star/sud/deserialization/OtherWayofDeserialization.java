package com.star.sud.deserialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class OtherWayofDeserialization implements Serializable {

	private static final long serialVersionUID = -5998634563080559763L;

	private String name;

	public OtherWayofDeserialization(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "OtherWayofDeserialization [name=" + name + "]";
	}

	static void serialize() throws IOException {
		OtherWayofDeserialization d = new OtherWayofDeserialization("Welcome to Java");
		FileOutputStream f = new FileOutputStream("file.txt");
		ObjectOutputStream oos = new ObjectOutputStream(f);
		oos.writeObject(d);
		oos.close();
		f.close();
	}

	static void deserialize() throws IOException, ClassNotFoundException {
		OtherWayofDeserialization d;
		FileInputStream f = new FileInputStream("file.txt");
		ObjectInputStream oos = new ObjectInputStream(f);
		d = (OtherWayofDeserialization) oos.readObject();
		System.out.println(d);
		oos.close();
	}

	public static void main(String[] args) {
		try {
			serialize();
			deserialize();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
