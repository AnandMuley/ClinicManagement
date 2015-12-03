package com.icare.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.icare.dtos.MedicineDto;
import com.icare.exceptions.NoDataFoundException;
import com.icare.services.MedicineService;
import com.icare.utils.MessageConstants;
import com.icare.utils.ModelConstants;
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
	public String addNew(MedicineDto medicineDto, Model model) {
		medicineService.addNew(medicineDto);
		model.addAttribute(ModelConstants.MESSAGE, "Medicine added !");
		return renderMedicineHome();
	}

	@RequestMapping(value = "searchby", method = RequestMethod.GET)
	public ModelAndView searchBy(@ModelAttribute("searchTxt") String name) {
		ModelAndView mav = new ModelAndView(ViewNames.MedicineHome.name());
		try {
			List<MedicineDto> medicines = medicineService.search(name);
			mav.addObject("medicines", medicines);
		} catch (NoDataFoundException e) {
			mav.addObject(MessageConstants.MESSAGE, e.getMessage());
		}
		return mav;
	}

}
