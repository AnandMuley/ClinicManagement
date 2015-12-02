package com.icare.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexViewController {

	static final Logger LOGGER = LoggerFactory
			.getLogger(IndexViewController.class);

	public static final String ICARE = "ICare";

	@RequestMapping(value = "index")
	public String renderIndex() {
		return ICARE;
	}

}
