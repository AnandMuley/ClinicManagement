package com.icare.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.icare.entities.PatientBean;

public interface PatientRepository extends JpaRepository<PatientBean, Integer> {

	List<PatientBean> findByNameContaining(String name);

}
