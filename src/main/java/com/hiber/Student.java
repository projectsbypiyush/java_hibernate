package com.hiber;

import java.util.Date;
import java.util.Arrays;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "stud")
public class Student {
	
	@Id
	private int id;
	
	@Column(length = 100)
	private String name;

	@Column(length = 50)
	private String city;
	
	@Temporal(TemporalType.DATE)
	private Date date_admitted;
	
	@Lob
	@Column(columnDefinition = "LONGBLOB")
	private byte[] image;
	
	private Certificate certi;

	public Certificate getCerti() {
		return certi;
	}

	public void setCerti(Certificate certi) {
		this.certi = certi;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, String city, Date date_admitted, byte[] image) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.date_admitted = date_admitted;
		this.image = image;
	}
	


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + ", date_admitted=" + date_admitted
				+ ", image=" + Arrays.toString(image) + ", certi=" + certi + "]";
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	
	}
	
	public Date getDate_admitted() {
		return date_admitted;
	}

	public void setDate_admitted(Date date_admitted) {
		this.date_admitted = date_admitted;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}
}
