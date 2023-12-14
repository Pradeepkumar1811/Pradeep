package com.ComaratorInterface;

public class Emp {

	private int id;
	private int phone_no;
	private String name;
	
	public Emp(int id, int phone_no, String name) {
		super();
		this.id = id;
		this.phone_no = phone_no;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(int phone_no) {
		this.phone_no = phone_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", phone_no=" + phone_no + ", name=" + name + "]";
	}
	
	
}
