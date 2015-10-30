package com.icare.converters;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import com.icare.constants.EyeType;

@Converter
public class EyeTypeConverter implements AttributeConverter<EyeType, String> {

	@Override
	public String convertToDatabaseColumn(EyeType attribute) {
		return attribute.name();
	}

	@Override
	public EyeType convertToEntityAttribute(String dbData) {
		return EyeType.valueOf(dbData);
	}

}
