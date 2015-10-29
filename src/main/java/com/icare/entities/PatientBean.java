package com.icare.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "patient", schema = "icare")
public class PatientBean {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String mrdNo;
	private String name;
	private Integer age;
	private String sex;
	private String address;
	private String contactNo;
	private String referredBy;
	private Integer fees;
	private Integer procedureFees;
	private String diseaseHistory;
	private String allergies;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMrdNo() {
		return mrdNo;
	}

	public void setMrdNo(String mrdNo) {
		this.mrdNo = mrdNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getReferredBy() {
		return referredBy;
	}

	public void setReferredBy(String referredBy) {
		this.referredBy = referredBy;
	}

	public Integer getFees() {
		return fees;
	}

	public void setFees(Integer fees) {
		this.fees = fees;
	}

	public Integer getProcedureFees() {
		return procedureFees;
	}

	public void setProcedureFees(Integer procedureFees) {
		this.procedureFees = procedureFees;
	}

	public String getDiseaseHistory() {
		return diseaseHistory;
	}

	public void setDiseaseHistory(String diseaseHistory) {
		this.diseaseHistory = diseaseHistory;
	}

	public String getAllergies() {
		return allergies;
	}

	public void setAllergies(String allergies) {
		this.allergies = allergies;
	}

	@Override
	public String toString() {
		return "PatientBean [id=" + id + ", mrdNo=" + mrdNo + ", name=" + name
				+ ", age=" + age + ", sex=" + sex + ", address=" + address
				+ ", contactNo=" + contactNo + ", referredBy=" + referredBy
				+ ", fees=" + fees + ", procedureFees=" + procedureFees
				+ ", diseaseHistory=" + diseaseHistory + ", allergies="
				+ allergies + "]";
	}

}
