package demoStudentMVCModel;

import java.util.Date;

public class Student {
	private int id;
	private String name;
	private String code;
	private double averageScore;
	private String address;
	private Date dateOfBirth;
	public Student() {
		super();
	}
	
	public Student(int id, String name, String code, double averageScore, String address, Date dateOfBirth) {
		super();
		this.id = id;
		this.name = name;
		this.code = code;
		this.averageScore = averageScore;
		this.address = address;
		this.dateOfBirth = dateOfBirth;
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
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public double getAverageScore() {
		return averageScore;
	}
	public void setAverageScore(double averageScore) {
		this.averageScore = averageScore;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
}
