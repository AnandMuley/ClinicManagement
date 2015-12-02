package com.icare.utils;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import com.icare.dtos.AppointmentDto;
import com.icare.dtos.OpdCasePaperDto;
import com.icare.entities.AppointmentBean;
import com.icare.entities.OpdCasePaperBean;
import com.icare.entities.PatientBean;

@Component
public class BeanCreatorUtil {

	@Autowired
	private ApplicationContext applicationContext;

	public OpdCasePaperBean createCasePaperBean(
			OpdCasePaperDto opdCasePaperDto, PatientBean patientBean) {
		OpdCasePaperBean opdCasePaperBean = applicationContext
				.getBean(OpdCasePaperBean.class);
		opdCasePaperBean.setEyeType(opdCasePaperDto.getEyeType());
		opdCasePaperBean.setPatientBean(patientBean);
		opdCasePaperBean.setDiagnosis(opdCasePaperDto.getDiagnosis());
		opdCasePaperBean.setFundus(opdCasePaperDto.getFundus());
		opdCasePaperBean.setIot(opdCasePaperDto.getIot());
		opdCasePaperBean.setNct(opdCasePaperDto.getNct());
		opdCasePaperBean.setPinHole(opdCasePaperDto.getPinHole());
		opdCasePaperBean.setSac(opdCasePaperDto.getSac());
		opdCasePaperBean.setSle(opdCasePaperDto.getSle());
		opdCasePaperBean.setVaNear(opdCasePaperDto.getVaNear());
		opdCasePaperBean.setVision(opdCasePaperDto.getVision());
		opdCasePaperBean.setId(opdCasePaperDto.getId());
		return opdCasePaperBean;
	}

	public AppointmentBean createAppointmentBean(AppointmentDto appointmentDto)
			throws ParseException {
		AppointmentBean appointmentBean = new AppointmentBean();
		appointmentBean.setAddress(appointmentDto.getAddress());
		appointmentBean.setAge(appointmentDto.getAge());
		appointmentBean.setConsultant(appointmentDto.getConsultant());
		appointmentBean.setContactNo(appointmentDto.getContactNo());
		appointmentBean.setDate(DateConverterUtil.toDate(
				appointmentDto.getDate(), DateConverterUtil.YYYYMMDD));
		appointmentBean.setName(appointmentDto.getName());
		appointmentBean.setReferredBy(appointmentDto.getReferredBy());
		appointmentBean.setSex(appointmentDto.getSex());
		return appointmentBean;
	}

}
