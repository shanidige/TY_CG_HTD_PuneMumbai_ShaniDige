package com.capgemini.hibernatepractice.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Shows")
public class Shows {
	@Id
	@Column
private int id;
	
	@Column
	private String name;
	@Column
	private int trp;
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
	public int getTrp() {
		return trp;
	}
	public void setTrp(int trp) {
		this.trp = trp;
	}
	
	
}
