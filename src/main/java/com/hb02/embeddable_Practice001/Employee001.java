package com.hb02.embeddable_Practice001;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "uni_employee001")
public class Employee001 {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int employeeId;
	
	@Embedded
	private Address001 address0001;
	
	@Embedded
	private PersonelInfo001 PersonelInfo0001;
	
	

}
