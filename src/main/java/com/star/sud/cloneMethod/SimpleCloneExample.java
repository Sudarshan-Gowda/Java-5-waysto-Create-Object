package com.star.sud.cloneMethod;

public class SimpleCloneExample implements Cloneable {

	private String name;

	@Override
	public String toString() {
		return "SimpleCloneExample [name=" + name + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public static void main(String[] args) throws CloneNotSupportedException {

		SimpleCloneExample exp1 = new SimpleCloneExample();
		exp1.setName("Welcome to Java");
		SimpleCloneExample exp2 = (SimpleCloneExample) exp1.clone();
		System.out.println(exp2);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
