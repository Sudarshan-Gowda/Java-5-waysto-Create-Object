package com.star.sud.singleimp;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Implementation {

	public static void main(String[] args) {

		try {

			// Step1: Using new keyword
			User usr1 = new User();
			usr1.setName("First Way");
			System.out.println(usr1);

			// Step2: Using newInstance method in Class class
			User usr2 = (User) Class.forName("com.star.sud.singleimp.User").newInstance();
			usr2.setName("Second Way");
			System.out.println(usr2);

			// Step3: Using newInstance method of constructor
			User usr = new User();
			User usr3 = usr.getClass().getConstructor().newInstance();
			usr3.setName("Third Way");
			System.out.println(usr3);

			// Step4: Using clone Method of Object class
			User usr4 = (User) usr.clone();
			usr4.setName("Fourth Way");
			System.out.println(usr4);

			// Step5: Using Serialization and Deserialization
			// Serialize
			usr.setName("First Way");
			FileOutputStream os = new FileOutputStream("text.txt");
			ObjectOutputStream oos = new ObjectOutputStream(os);
			oos.writeObject(usr);
			oos.close();
			os.close();

			// De-serialize
			FileInputStream is = new FileInputStream("text.txt");
			ObjectInputStream ois = new ObjectInputStream(is);
			User usr5 = (User) ois.readObject();
			System.out.println(usr5);
			ois.close();
			is.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
