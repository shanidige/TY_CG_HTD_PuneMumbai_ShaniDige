package com.capgemini.springcore1.beans;

import java.util.List;
import java.util.Set;

public class Medicine {

	
	
	private String name;
	private String type;
	private double price;
//	private Set<String> drugs;
	private List<String> drugset;
	
public List<String> getDrugset() {
		return drugset;
	}
	public void setDrugset(List<String> drugset) {
		this.drugset = drugset;
	}
	//	public Set<String> getDrugs() {
//		return drugs;
//	}
//	public void setDrugs(Set<String> drugs) {
//		this.drugs = drugs;
//	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	
}
