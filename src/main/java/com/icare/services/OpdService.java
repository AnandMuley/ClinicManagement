package com.icare.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icare.constants.EyeType;
import com.icare.dtos.OpdCasePaperDto;
import com.icare.dtos.PatientDto;
import com.icare.entities.OpdCasePaperBean;
import com.icare.entities.PatientBean;
import com.icare.repositories.OpdRepository;
import com.icare.repositories.PatientRepository;
import com.icare.utils.BeanCreatorUtil;

@Service
public class OpdService {

	@Autowired
	private OpdRepository opdRepository;

	@Autowired
	private BeanCreatorUtil beanCreatorUtil;

	@Autowired
	private PatientRepository patientRepository;

	public void saveDetails(PatientDto patientDto) {

		patientDto.getOpdCasePaperDtos().get(0).setEyeType(EyeType.Left);
		patientDto.getOpdCasePaperDtos().get(1).setEyeType(EyeType.Right);

		PatientBean patientBean = patientRepository.findOne(patientDto.getId());
		List<OpdCasePaperBean> casePaperBeans = new ArrayList<OpdCasePaperBean>(
				2);
		for (OpdCasePaperDto opdCasePaperDto : patientDto.getOpdCasePaperDtos()) {
			OpdCasePaperBean opdCasePaperBean = beanCreatorUtil
					.createCasePaperBean(opdCasePaperDto, patientBean);
			casePaperBeans.add(opdCasePaperBean);
		}
		opdRepository.save(casePaperBeans);
	}

}
