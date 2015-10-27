package com.icare.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.icare.utils.ViewNames;

@Controller
@RequestMapping("opd")
public class OpdController {

	@RequestMapping("casepaper")
	public ModelAndView renderCasePaper() {
		return new ModelAndView(ViewNames.CasePaper.name());
	}

}
