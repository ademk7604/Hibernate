package com.hb02.embeddable_Practice001;

import javax.persistence.Embeddable;

@Embeddable
public class PersonelInfo001 {

	private String name;
	private String surname;
	private String sex;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "PersonelInfo001 [name=" + name + ", surname=" + surname + ", sex=" + sex + "]";
	}

}
