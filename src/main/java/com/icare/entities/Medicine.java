package com.icare.entities;

import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.icare.converters.MedicineTypeConverter;
import com.icare.dtos.MedicineDto.MedicineType;

@Entity
@Table(schema = "icare", name = "medicines")
public class Medicine {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String name;
	private String code;
	@Convert(converter = MedicineTypeConverter.class)
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
		return "Medicine [id=" + id + ", name=" + name + ", code=" + code
				+ ", medicineType=" + medicineType + "]";
	}

}
