package com.tien;

public class Student {
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", code=" + code + "]";
	}
	private int id;
	private String name;
	private String code;
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
	public Student(int id, String name, String code) {
		super();
		this.id = id;
		this.name = name;
		this.code = code;
	}
	public Student() {
		super();
	}
	
}
