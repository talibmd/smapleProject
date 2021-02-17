package com.src;

import java.util.List;

public class Employee {

	private int eid;
	private String ename;
	private int experience;
	private List<EAddress> address;
	public Employee(int eid, String ename, int experience, List<EAddress> address) {
		
		this.eid = eid;
		this.ename = ename;
		this.experience = experience;
		this.address = address;
	}
	public Employee()
	{
		
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public List<EAddress> getAddress() {
		return address;
	}
	public void setAddress(List<EAddress> address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", experience=" + experience + ", address=" + address
				+ "]";
	}
	
	
}

class EAddress
{
	
	private int hno;
	private String city;
	private String state;
	private String country;
	public EAddress(int hno, String city, String state, String country) {
		
		this.hno = hno;
		this.city = city;
		this.state = state;
		this.country = country;
	}
	
	public EAddress()
	{
		
	}

	public int getHno() {
		return hno;
	}

	public void setHno(int hno) {
		this.hno = hno;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "EAddress [hno=" + hno + ", city=" + city + ", state=" + state + ", country=" + country + "]";
	}
	
}