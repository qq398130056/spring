package com.iotek.entity;

import java.util.List;
import java.util.Map;

public class Person {
	private int id;
	private String name;
	private Address address;
	private List<Car> cars;
	private Map<Integer, Car> cars_map;

	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Person() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Car> getCars() {
		return cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}

	public Map<Integer, Car> getCars_map() {
		return cars_map;
	}

	public void setCars_map(Map<Integer, Car> cars_map) {
		this.cars_map = cars_map;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", address=" + address + ", cars=" + cars + ", cars_map="
				+ cars_map + "]";
	}

}
