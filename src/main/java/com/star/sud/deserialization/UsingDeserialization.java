package com.star.sud.deserialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.star.sud.Employee;

public class UsingDeserialization {

	public static void main(String[] args) {

		try {
			createInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	static void createInstance() throws FileNotFoundException, IOException, ClassNotFoundException {
		Employee emp1 = new Employee();

		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("data.obj"));
		out.writeObject(emp1);
		out.close();

		// Deserialization
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("data.obj"));
		Employee emp2 = (Employee) in.readObject();
		in.close();

		emp2.setEmpId(1);
		emp2.setEmpName("Sudarshan");
		emp2.setEmpDept("PD");
		System.out.println(emp2);
	}

}
