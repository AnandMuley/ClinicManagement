package com.icare.utils;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import com.icare.beans.AddressBean;
import com.icare.beans.AppointmentBean;
import com.icare.beans.AppointmentTypeBean;
import com.icare.beans.ContactBean;
import com.icare.beans.MedicineBean;
import com.icare.beans.PatientBean;
import com.icare.beans.PrescriptionBean;
import com.icare.beans.VisitBean;
import com.icare.entities.AddressEntity;
import com.icare.entities.AppointmentEntity;
import com.icare.entities.AppointmentEntity.Status;
import com.icare.entities.AppointmentTypeEntity;
import com.icare.entities.ContactEntity;
import com.icare.entities.MedicineEntity;
import com.icare.entities.PatientEntity;
import com.icare.entities.PrescriptionEntity;
import com.icare.entities.VisitEntity;

public final class EntityCreatorUtil {

	public static MedicineEntity createMedicine(MedicineBean bean) {
		MedicineEntity entity = new MedicineEntity(bean.getName(),
				bean.getManufacturer(), bean.getType(), bean.getUnit());
		return entity;
	}

	public static VisitEntity createVisit(VisitBean visitBean) {
		PatientEntity patient = new PatientEntity(visitBean.getPatient()
				.getId());
		Date visitDt = new Date();

		VisitEntity visitEntity = new VisitEntity(patient,
				visitBean.getProblems(), visitBean.getSymptoms(),
				visitBean.getAllergies(), visitBean.getTestResults(), visitDt);
		return visitEntity;
	}

	public static VisitEntity updateVisit(VisitBean visitBean)
			throws ParseException {
		PatientEntity patient = new PatientEntity(visitBean.getPatient()
				.getId());
		Date visitDate = DateUtil.toDate(visitBean.getVisitDt(),
				AppConstants.DD_MMM_YYYY);
		VisitEntity visitEntity = new VisitEntity(patient,
				visitBean.getProblems(), visitBean.getSymptoms(),
				visitBean.getAllergies(), visitBean.getTestResults(), visitDate);
		return visitEntity;
	}

	public static PatientEntity createPatient(PatientBean patientTO)
			throws IOException {
		PatientEntity patientModel = new PatientEntity(
				patientTO.getFirstName(), patientTO.getMiddleName(),
				patientTO.getLastName());
		if (null != patientTO.getProfilePic()) {
			patientModel.setProfilePic(patientTO.getProfilePic().getBytes());
		}
		return patientModel;
	}

	public static ContactEntity createContact(ContactBean contactTO) {
		ContactEntity contactModel = new ContactEntity(contactTO.getMobileNo(),
				contactTO.getLandline(), contactTO.getPersonalEmail(),
				contactTO.getOfficialEmail());
		return contactModel;
	}

	public static AddressEntity createAddress(AddressBean addressTO) {
		AddressEntity addressModel = new AddressEntity(
				addressTO.getAddrLine1(), addressTO.getAddrLine2(),
				addressTO.getCity(), addressTO.getState(),
				addressTO.getPinCode());
		return addressModel;
	}

	public static void updatePatient(PatientBean patientBean,
			PatientEntity patientModel) {
		if (null != patientBean.getContact()) {
			updateContact(patientBean.getContact(), patientModel.getContact());
		}
		patientModel.setContact(patientModel.getContact());
		patientModel.setFirstName(patientBean.getFirstName());
		patientModel.setLastName(patientBean.getLastName());
		patientModel.setMiddleName(patientBean.getMiddleName());
		try {
			if (patientBean.getProfilePic().getSize() > 0) {
				patientModel.setProfilePic(patientBean.getProfilePic()
						.getBytes());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void updateContact(ContactBean contactBean,
			ContactEntity contactModel) {
		if (null != contactBean.getAddress()) {
			updateAddress(contactBean.getAddress(), contactModel.getAddress());
		}
		contactModel.setAddress(contactModel.getAddress());
		contactModel.setLandline(contactBean.getLandline());
		contactModel.setMobileNo(contactBean.getMobileNo());
		contactModel.setOfficialEmail(contactBean.getOfficialEmail());
		contactModel.setPersonalEmail(contactBean.getPersonalEmail());
	}

	public static void updateAddress(AddressBean addressTO,
			AddressEntity addressModel) {
		addressModel.setAddrLine1(addressTO.getAddrLine1());
		addressModel.setAddrLine2(addressTO.getAddrLine2());
		addressModel.setCity(addressTO.getCity());
		addressModel.setPinCode(addressTO.getPinCode());
		addressModel.setState(addressTO.getState());
	}

	public static AppointmentEntity createAppointment(
			AppointmentBean appointment, AppointmentTypeEntity type,
			PatientEntity patient) throws ParseException {
		AppointmentEntity appointmentModel = new AppointmentEntity(
				DateUtil.toDate(appointment.getDate(), AppConstants.DD_MMM_YYYY),
				appointment.getDetails(), type, patient, Status.BOOKED
						.getValue());
		return appointmentModel;
	}

	public static void updateAppointment(AppointmentEntity model,
			AppointmentBean bean) throws ParseException {
		model.setDate(DateUtil.toDate(bean.getDate(), AppConstants.DD_MMM_YYYY));
		updatePatient(bean.getPatient(), model.getPatient());
		model.setTime(bean.getAppointmentTime());
		updateAppointmentType(model.getType(), bean.getType());
	}

	public static void updateContact(ContactEntity model, ContactBean bean) {
		updateAddress(bean.getAddress(), model.getAddress());
		model.setLandline(bean.getLandline());
		model.setMobileNo(bean.getMobileNo());
		model.setOfficialEmail(bean.getOfficialEmail());
		model.setPersonalEmail(bean.getPersonalEmail());
	}

	public static void updateAppointmentType(AppointmentTypeEntity model,
			AppointmentTypeBean bean) {
		model.setName(bean.getName());
	}

	public static AppointmentTypeEntity createAppointmentType(
			AppointmentTypeBean appointmentTypeBean) {
		AppointmentTypeEntity appointmentTypeModel = new AppointmentTypeEntity(
				appointmentTypeBean.getName());
		return appointmentTypeModel;
	}

	public static PrescriptionEntity createPrescription(PrescriptionBean bean) {
		VisitEntity visitEntity = new VisitEntity(bean.getVisit().getId());
		PrescriptionEntity prescriptionEntity = new PrescriptionEntity(
				bean.getMedicineId(), bean.getFrequency(),
				bean.getMedQuantity(), bean.getFreqType(), visitEntity);
		return prescriptionEntity;
	}

}
