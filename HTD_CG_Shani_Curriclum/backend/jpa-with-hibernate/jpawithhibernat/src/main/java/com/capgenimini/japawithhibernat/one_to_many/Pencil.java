package com.capgenimini.japawithhibernat.one_to_many;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Pencil")
public class Pencil {
	@Id
	@Column
 private int pid;
 
	@Column
 private String clour;

	
	  @ManyToOne(cascade=CascadeType.ALL)
	  
	  @JoinColumn(name="boxid", nullable=false) 
	  private PencilBox pencilbox;
	 
	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getClour() {
		return clour;
	}

	public void setClour(String clour) {
		this.clour = clour;
	}

	
	  public PencilBox getPencilbox() { return pencilbox; }
	  
	  public void setPencilbox(PencilBox pencilbox) { this.pencilbox = pencilbox; }
	 
	
 
}
