package com.iotek.entity;

public class Address {
	private String name;

	public Address(String name) {
		super();
		this.name = name;
	}

	public Address() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Address [name=" + name + "]";
	}

}
