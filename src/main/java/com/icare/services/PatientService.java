package com.icare.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.icare.entities.PatientBean;
import com.icare.exceptions.NoDataFoundException;
import com.icare.exceptions.PatientServiceException;
import com.icare.repositories.PatientRepository;

@Service
public class PatientService {

	static final Logger LOGGER = LoggerFactory.getLogger(PatientService.class);

	@Autowired
	private PatientRepository patientRepository;

	public void save(PatientBean patientBean) throws PatientServiceException {
		patientRepository.save(patientBean);
	}

	public List<PatientBean> searchPatient(String name)
			throws NoDataFoundException {
		List<PatientBean> searchedPatients = patientRepository
				.findByNameContaining(name);
		if (CollectionUtils.isEmpty(searchedPatients)) {
			throw new NoDataFoundException("No patients found");
		}
		return searchedPatients;
	}

	public PatientBean findById(Integer id) {
		return patientRepository.findOne(id);
	}

	public Integer delete(Integer patientId) {
		patientRepository.delete(patientId);
		return patientId;
	}
}
