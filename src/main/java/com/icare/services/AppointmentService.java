package com.icare.services;

import java.text.ParseException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icare.dtos.AppointmentDto;
import com.icare.dtos.AppointmentSearchDto;
import com.icare.entities.AppointmentBean;
import com.icare.exceptions.AppointmentException;
import com.icare.exceptions.InvalidAppointmentDateException;
import com.icare.repositories.AppointmentRepository;
import com.icare.utils.BeanCreatorUtil;
import com.icare.utils.DtoCreatorUtil;

@Service
public class AppointmentService {

	static final Logger LOGGER = LoggerFactory
			.getLogger(AppointmentService.class);

	@Autowired
	private AppointmentRepository appointmentRepository;

	@Autowired
	private BeanCreatorUtil beanCreatorUtil;

	@Autowired
	private DtoCreatorUtil dtoCreatorUtil;

	public void createNew(AppointmentDto appointmentDto)
			throws AppointmentException {
		try {
			AppointmentBean appointmentBean = beanCreatorUtil
					.createAppointmentBean(appointmentDto);
			appointmentRepository.save(appointmentBean);
			appointmentDto.setId(appointmentBean.getId());
		} catch (ParseException e) {
			throw new InvalidAppointmentDateException(e);
		}
	}

	public void searchAppointments(AppointmentSearchDto appointmentSearchDto) {
		List<AppointmentBean> appointmentBeans = appointmentRepository
				.findByDate(appointmentSearchDto.getForDate());
		for (AppointmentBean appointmentBean : appointmentBeans) {
			AppointmentDto appointmentDto = dtoCreatorUtil
					.createAppointmentDto(appointmentBean);
			appointmentSearchDto.getAppointments().add(appointmentDto);
		}
	}

}
