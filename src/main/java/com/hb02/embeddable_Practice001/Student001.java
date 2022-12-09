package com.hb02.embeddable_Practice001;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "uni_student")
public class Student001 {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)

	private int SudenId;

	@Embedded
	private Address001 Address0001;

	@Embedded
	private PersonelInfo001 PersonelInfo0001;

	public int getSudenId() {
		return SudenId;
	}

	public void setSudenId(int sudenId) {
		SudenId = sudenId;
	}

	public Address001 getAddress0001() {
		return Address0001;
	}

	public void setAddress0001(Address001 address0001) {
		Address0001 = address0001;
	}

	public PersonelInfo001 getPersonelInfo0001() {
		return PersonelInfo0001;
	}

	public void setPersonelInfo0001(PersonelInfo001 personelInfo0001) {
		PersonelInfo0001 = personelInfo0001;
	}

	@Override
	public String toString() {
		return "Student001 [SudenId=" + SudenId + ", Address0001=" + Address0001 + ", PersonelInfo0001="
				+ PersonelInfo0001 + "]";
	}


}
