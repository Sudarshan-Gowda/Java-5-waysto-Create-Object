package com.star.sud.newInstanceMethodofClass;

import com.star.sud.Employee;

public class UsingNewInstanceClass {

	public static void main(String[] args) {

		try {
			createInstance();
			createInstanceOtherWay();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	static void createInstance() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Employee emp = (Employee) Class.forName("com.star.sud.Employee").newInstance();
		emp.setEmpId(1);
		emp.setEmpName("Sudarshan");
		emp.setEmpDept("PD");
		System.out.println(emp);

	}

	static void createInstanceOtherWay() throws InstantiationException, IllegalAccessException {
		Employee emp = Employee.class.newInstance();
		emp.setEmpId(1);
		emp.setEmpName("Sudarshan");
		emp.setEmpDept("PD");
		System.out.println(emp);

	}
}
