package com.hb04.bi_onetoonePractice03;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class diary002 {

	@Id
	private int id;
	
	private String name;
	
	private int ega;
	
	@OneToOne
	@JoinColumn
	private Student004 student04;
	

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

	public int getEga() {
		return ega;
	}

	public void setEga(int ega) {
		this.ega = ega;
	}

	@Override
	public String toString() {
		return "diary002 [id=" + id + ", name=" + name + ", ega=" + ega + "]";
	}
	
}
