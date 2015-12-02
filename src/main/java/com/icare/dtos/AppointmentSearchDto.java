package com.icare.dtos;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class AppointmentSearchDto {

	private Date forDate = new Date();
	private List<AppointmentDto> appointments = new LinkedList<AppointmentDto>();

	public Date getForDate() {
		return forDate;
	}

	public void setForDate(Date forDate) {
		this.forDate = forDate;
	}

	public List<AppointmentDto> getAppointments() {
		return appointments;
	}

	@Override
	public String toString() {
		return "AppointmentSearchDto [forDate=" + forDate + ", appointments="
				+ appointments + "]";
	}

}
