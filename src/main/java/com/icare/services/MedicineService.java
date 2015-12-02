package com.icare.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icare.dtos.MedicineDto;
import com.icare.entities.Medicine;
import com.icare.repositories.MedicineRepository;
import com.icare.utils.BeanCreatorUtil;

@Service
public class MedicineService {

	@Autowired
	private MedicineRepository medicineRepository;

	@Autowired
	private BeanCreatorUtil beanCreatorUtil;

	public void addNew(MedicineDto medicineDto) {
		Medicine medicine = beanCreatorUtil.createMedicine(medicineDto);
		medicineRepository.save(medicine);
		medicineDto.setId(medicine.getId());
	}

}
