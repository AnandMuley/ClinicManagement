package com.icare.dtos;

public class MedicineDto {

	public enum MedicineType {
		Capsule, Tablet, EyeDrop, EyeOintment, Injection, Syrup
	}

	private Integer id;
	private String name;
	private String code;
	private MedicineType medicineType;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public MedicineType getMedicineType() {
		return medicineType;
	}

	public void setMedicineType(MedicineType medicineType) {
		this.medicineType = medicineType;
	}

	@Override
	public String toString() {
		return "MedicineDto [id=" + id + ", name=" + name + ", code=" + code
				+ ", medicineType=" + medicineType + "]";
	}

}
