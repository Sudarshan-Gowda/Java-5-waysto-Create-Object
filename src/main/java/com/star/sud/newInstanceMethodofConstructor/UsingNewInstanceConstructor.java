package com.star.sud.newInstanceMethodofConstructor;

import java.lang.reflect.InvocationTargetException;

import com.star.sud.Employee;

public class UsingNewInstanceConstructor {

	public static void main(String[] args) {

		try {
			createInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	static void createInstance() throws NoSuchMethodException, SecurityException, InstantiationException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		Employee emp = Employee.class.getConstructor().newInstance();
		emp.setEmpId(1);
		emp.setEmpDept("PD");
		emp.setEmpName("Sudarshan");
		System.out.println(emp);
	}

}
