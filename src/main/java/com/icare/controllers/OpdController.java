package com.icare.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.icare.dtos.PatientDto;
import com.icare.entities.PatientBean;
import com.icare.services.OpdService;
import com.icare.services.PatientService;
import com.icare.utils.ViewNames;

@Controller
@RequestMapping(value = "opdpaper")
public class OpdController {

	@Autowired
	private OpdService opdService;

	@Autowired
	private PatientService patientService;

	@ModelAttribute("patientDto")
	public PatientDto getPatientDto() {
		return new PatientDto();
	}

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView viewOpdCasePaper(
			@ModelAttribute("pid") Integer patientId) {
		ModelAndView modelAndView = new ModelAndView(ViewNames.CasePaper.name());
		PatientBean patientBean = patientService.findById(patientId);
		opdService.searchCasePaper(patientBean);
		modelAndView.addObject("patient", patientBean);
		return modelAndView;
	}

	@RequestMapping(value = "save", method = RequestMethod.POST)
	public ModelAndView saveDetails(
			@ModelAttribute("patientDto") PatientDto patientDto) {
		opdService.saveDetails(patientDto);
		return viewOpdCasePaper(patientDto.getId());
	}

}
