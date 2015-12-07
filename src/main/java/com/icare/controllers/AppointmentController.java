package com.icare.controllers;

import java.text.ParseException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.icare.dtos.AppointmentDto;
import com.icare.dtos.AppointmentSearchDto;
import com.icare.exceptions.AppointmentException;
import com.icare.services.AppointmentService;
import com.icare.utils.ViewNames;

@Controller
@RequestMapping(value = "appointment")
public class AppointmentController {

	static final Logger LOGGER = LoggerFactory
			.getLogger(AppointmentController.class);

	@Autowired
	private AppointmentService appointmentService;

	@RequestMapping
	public String renderAppointmentHome() {
		return ViewNames.BookAppointment.name();
	}

	@RequestMapping(value = "viewall")
	public String renderViewAppointments(Model model) {
		AppointmentSearchDto appointmentSearchDto = new AppointmentSearchDto();
		appointmentService.searchAppointments(appointmentSearchDto);
		model.addAttribute("searchResults", appointmentSearchDto);
		return ViewNames.ViewAppointments.name();
	}

	@RequestMapping(value = "book")
	public String bookNow(@ModelAttribute AppointmentDto appointmentDto,
			Model model) {
		try {
			appointmentService.createNew(appointmentDto);
			model.addAttribute("Message", "Appointment booked successfully!");
		} catch (AppointmentException e) {
			model.addAttribute("Message", e.getMessage());
		}
		return ViewNames.BookAppointment.name();
	}

	@RequestMapping(value = "search")
	public String searchAppointment(
			@ModelAttribute("date") String appointmentDate, Model model) {
		AppointmentSearchDto appointmentSearchDto = new AppointmentSearchDto();
		try {
			appointmentSearchDto.setForDate(appointmentDate);
			appointmentService.searchAppointments(appointmentSearchDto);
			model.addAttribute("searchResults", appointmentSearchDto);
		} catch (ParseException e) {
			model.addAttribute("Message", e.getMessage());
		}
		return ViewNames.ViewAppointments.name();
	}

}
