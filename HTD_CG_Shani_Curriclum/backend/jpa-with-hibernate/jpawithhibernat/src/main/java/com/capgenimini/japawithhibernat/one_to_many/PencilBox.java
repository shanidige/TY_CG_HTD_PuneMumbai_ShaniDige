package com.capgenimini.japawithhibernat.one_to_many;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name = "PencilBox")
public class PencilBox {
	@Id
	@Column
	private int boxid;
	
	@Column
	private String name;
 @OneToMany(mappedBy="PencilBox")
 private List<Pencil> Pencil;
 private Pencil pencil;
 
 
	public int getBoxid() {
		return boxid;
	}

	public Pencil getPencil() {
		return pencil;
	}

	public void setPencil(Pencil pencil) {
		this.pencil = pencil;
	}

	public void setBoxid(int boxid) {
		this.boxid = boxid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
