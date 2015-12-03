package com.icare.services;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.icare.dtos.MedicineDto;
import com.icare.entities.Medicine;
import com.icare.exceptions.NoDataFoundException;
import com.icare.repositories.MedicineRepository;
import com.icare.utils.BeanCreatorUtil;
import com.icare.utils.DtoCreatorUtil;

@Service
public class MedicineService {

	@Autowired
	private MedicineRepository medicineRepository;

	@Autowired
	private BeanCreatorUtil beanCreatorUtil;

	@Autowired
	private DtoCreatorUtil dtoCreatorUtil;

	public void addNew(MedicineDto medicineDto) {
		Medicine medicine = beanCreatorUtil.createMedicine(medicineDto);
		medicineRepository.save(medicine);
		medicineDto.setId(medicine.getId());
	}

	public List<MedicineDto> search(String name) throws NoDataFoundException {
		List<Medicine> medicines = medicineRepository
				.findByNameContaining(name);
		if (CollectionUtils.isEmpty(medicines)) {
			throw new NoDataFoundException("No medicines found !");
		}
		List<MedicineDto> medicineDtos = new LinkedList<MedicineDto>();
		for (Medicine medicine : medicines) {
			medicineDtos.add(dtoCreatorUtil.createMedicineDto(medicine));
		}
		return medicineDtos;
	}

}
