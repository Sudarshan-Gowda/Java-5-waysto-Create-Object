package com.star.sud.cloneMethod;

import com.star.sud.Employee;

public class UsingCloneMethod {

	public static void main(String[] args) throws CloneNotSupportedException {

		Employee emp1 = new Employee();
		emp1.setEmpId(1);
		emp1.setEmpName("Sudarshan");
		emp1.setEmpDept("PD");
		Employee emp2 = (Employee) emp1.clone(); // Clone Method
		System.out.println(emp2);
	}

}
