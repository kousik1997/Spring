package com.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Emp {

	private String name;
	private List<String> phones;
	private Set<String> addresses;
	private Map<String,String> coureses;
	
	public Emp() {
		super();
	}
	public Emp(String name, List<String> phones, Set<String> addresses, Map<String, String> coureses) {
		super();
		this.name = name;
		this.phones = phones;
		this.addresses = addresses;
		this.coureses = coureses;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public Set<String> getAddresses() {
		return addresses;
	}
	public void setAddresses(Set<String> addresses) {
		this.addresses = addresses;
	}
	public Map<String, String> getCoureses() {
		return coureses;
	}
	public void setCoureses(Map<String, String> coureses) {
		this.coureses = coureses;
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", phones=" + phones + ", addresses=" + addresses + ", coureses=" + coureses + "]";
	}
	
	
	
}
