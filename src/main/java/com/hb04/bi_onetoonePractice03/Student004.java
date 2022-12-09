package com.hb04.bi_onetoonePractice03;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Student004 {
	
	@Id
	private int id;
	
	@Column
	private String name;
	
	private int age;
	
	@OneToOne (mappedBy = "student04")
	private diary002 diary02;
	

	public diary002 getDiary02() {
		return diary02;
	}

	public void setDiary02(diary002 diary02) {
		this.diary02 = diary02;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student004 [id=" + id + ", name=" + name + ", age=" + age + ", diary02=" + diary02 + "]";
	}

	
	}

