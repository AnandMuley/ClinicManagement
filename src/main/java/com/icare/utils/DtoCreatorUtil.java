package com.icare.utils;

import org.springframework.stereotype.Component;

import com.icare.dtos.AppointmentDto;
import com.icare.entities.AppointmentBean;

@Component
public class DtoCreatorUtil {

	public AppointmentDto createAppointmentDto(AppointmentBean appointmentBean) {
		AppointmentDto appointmentDto = new AppointmentDto();
		appointmentDto.setAddress(appointmentBean.getAddress());
		appointmentDto.setAge(appointmentBean.getAge());
		appointmentDto.setConsultant(appointmentBean.getConsultant());
		appointmentDto.setContactNo(appointmentBean.getContactNo());
		appointmentDto.setDate(DateConverterUtil.toString(
				appointmentBean.getDate(), DateConverterUtil.DDMMMYYYY));
		appointmentDto.setId(appointmentBean.getId());
		appointmentDto.setName(appointmentBean.getName());
		appointmentDto.setReferredBy(appointmentBean.getReferredBy());
		appointmentDto.setSex(appointmentBean.getSex());
		return appointmentDto;
	}

}
