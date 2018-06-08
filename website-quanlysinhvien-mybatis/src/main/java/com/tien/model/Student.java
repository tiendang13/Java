package com.tien.model;

import java.sql.Date;

public class Student {
	private int id;
	private String name;
	private String code;
	private String address;
	private double score;
	private Date dateOfBirth;
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
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", code=" + code + ", address=" + address + ", score=" + score
				+ ", dateOfBirth=" + dateOfBirth + "]";
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public Student(int id, String name, String code, String address, double score, Date dateOfBirth) {
		super();
		this.id = id;
		this.name = name;
		this.code = code;
		this.address = address;
		this.score = score;
		this.dateOfBirth = dateOfBirth;
	}
	public Student() {
		super();
	}
	
}
