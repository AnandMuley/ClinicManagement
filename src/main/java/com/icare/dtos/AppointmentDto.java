package com.icare.dtos;

public class AppointmentDto {

	private String id;
	private String name;
	private long age;
	private String sex;
	private long contactNo;
	private String date;
	private String address;
	private String consultant;
	private String referredBy;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getAge() {
		return age;
	}

	public void setAge(long age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getConsultant() {
		return consultant;
	}

	public void setConsultant(String consultant) {
		this.consultant = consultant;
	}

	public String getReferredBy() {
		return referredBy;
	}

	public void setReferredBy(String referredBy) {
		this.referredBy = referredBy;
	}

	@Override
	public String toString() {
		return "AppointmentDto [id=" + id + ", name=" + name + ", age=" + age
				+ ", sex=" + sex + ", contactNo=" + contactNo + ", date="
				+ date + ", address=" + address + ", consultant=" + consultant
				+ ", referredBy=" + referredBy + "]";
	}

}
