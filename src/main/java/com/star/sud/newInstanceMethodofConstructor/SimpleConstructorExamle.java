package com.star.sud.newInstanceMethodofConstructor;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SimpleConstructorExamle {

	private String name;

	@Override
	public String toString() {
		return "SimpleConstructorExamle [name=" + name + "]";
	}

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		Constructor<SimpleConstructorExamle> declaredConstructors = SimpleConstructorExamle.class
				.getDeclaredConstructor();

		SimpleConstructorExamle newInstance = declaredConstructors.newInstance();
		newInstance.setName("Welcome to Java");
		System.out.println(newInstance);

	}

	public void setName(String name) {
		this.name = name;
	}

}
