package com.hb01.annotations;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

//Ctrl+Shift+O
//Ctrl+Space

//Bu annotationu koyduğumuz sınıf veritabanında bir tabloya karşılık gelecek
@Entity
@Table(name="t_student01")//Eğer oluşacak tablo ismini değiştirmek istenirse name attribute ile bir tablo ismi verilir.
public class Student01 {
	
	@Id  //primary key oluşmasını sağlıyor.
	private int id;
	
	//default lari unique=false // nullable=true // length default=255
	//Column annotationı zorunlu değil ancak customize edebilmek için  gerekli
	@Column(name="student_name",length = 100,nullable = false,unique=false)
	private String name;
	
	@Transient //veritabanı tablosunda grade adında bir kolon oluşturulmaz.
	//kod icinde kullaniriz ama veri tabanina gondermek istemiyorsak kulaniyoruz.
	private int grade;
	
   
//	@Lob  //large object ile büyük boyutlu datalar tutulabilir. 
//	private byte [] image; 

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

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student01 [id=" + id + ", name=" + name + ", grade=" + grade + "]";
	}
	

}
