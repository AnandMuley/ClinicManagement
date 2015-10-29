package com.icare.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icare.repositories.OpdRepository;

@Service
public class OpdService {

	@Autowired
	private OpdRepository opdRepository;

}
