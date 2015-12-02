package com.icare.converters;

import javax.persistence.AttributeConverter;

import com.icare.dtos.MedicineDto.MedicineType;

public class MedicineTypeConverter implements
		AttributeConverter<MedicineType, String> {

	@Override
	public String convertToDatabaseColumn(MedicineType attribute) {
		return attribute.name();
	}

	@Override
	public MedicineType convertToEntityAttribute(String dbData) {
		return MedicineType.valueOf(dbData);
	}

}
