package com.icare.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.icare.dtos.MedicineDto;
import com.icare.services.MedicineService;
import com.icare.utils.ViewNames;

@Controller
@RequestMapping(value = "medicine")
public class MedicineController {

	static final Logger LOGGER = LoggerFactory
			.getLogger(MedicineController.class);

	@Autowired
	private MedicineService medicineService;

	@RequestMapping
	public String renderMedicineHome() {
		return ViewNames.MedicineHome.name();
	}

	@RequestMapping(value = "add")
	public String addNew(MedicineDto medicineDto) {
		medicineService.addNew(medicineDto);
		return renderMedicineHome();
	}

}
