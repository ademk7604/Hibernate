package com.hb02.embeddable_Practice001;

import javax.persistence.Embeddable;

@Embeddable // Gomulebilir classimizi, classin tam ustune yaziyoruz.
public class Address001 {

	private String street;
	private String city;
	private String country;
	private int postCode;

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getPostCode() {
		return postCode;
	}

	public void setPostCode(int postCode) {
		this.postCode = postCode;
	}

	@Override
	public String toString() {
		return "address [street=" + street + ", city=" + city + ", country=" + country + ", postCode=" + postCode + "]";
	}

}
