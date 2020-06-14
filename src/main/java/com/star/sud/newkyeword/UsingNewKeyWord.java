package com.star.sud.newkyeword;

import com.star.sud.Employee;

public class UsingNewKeyWord {

	public static void main(String[] args) {

		Employee emp = new Employee(); // new keyword will create new instance or object
		emp.setEmpId(1);
		emp.setEmpName("Sudarsha");
		emp.setEmpDept("PD");

		System.out.println(emp);
	}
}
