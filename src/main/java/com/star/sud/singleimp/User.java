package com.star.sud.singleimp;

import java.io.Serializable;

/**
 * @author Lenovo
 *
 */
public class User implements Cloneable, Serializable {

	private static final long serialVersionUID = -1353634109847698867L;

	private String name;

	public User() {
		super();
	}

	public User(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [name=" + name + "]";
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
