package com.model;

public class Student {
	private int id;
	private String hoten;
	private String lop;
	public Student(int id, String hoten, String lop) {
		super();
		this.id = id;
		this.hoten = hoten;
		this.lop = lop;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", hoten=" + hoten + ", lop=" + lop + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public String getLop() {
		return lop;
	}
	public void setLop(String lop) {
		this.lop = lop;
	}
	
}
