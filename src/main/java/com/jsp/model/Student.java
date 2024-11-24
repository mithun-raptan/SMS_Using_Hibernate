package com.jsp.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	private int rollno;
	private String name;
	private String gmail;
	private String dob;
	private String address;
	private String careOf;
	
	//getters() and setters() method
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGmail() {
		return gmail;
	}
	public void setGmail(String gmail) {
		this.gmail = gmail;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCareOf() {
		return careOf;
	}
	public void setCareOf(String careOf) {
		this.careOf = careOf;
	}
	//override toString() method =>it means Student Entity class reference variable will print Student object only. 
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", gmail=" + gmail + ", dob=" + dob + ", address="
				+ address + ", careOf=" + careOf + "]";
	}
	
	
	
}
