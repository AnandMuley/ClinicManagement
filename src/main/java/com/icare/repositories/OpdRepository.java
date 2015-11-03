package com.icare.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.icare.entities.OpdCasePaperBean;

public interface OpdRepository extends JpaRepository<OpdCasePaperBean, Integer> {

	@Query(value = "SELECT cp FROM OpdCasePaperBean cp WHERE cp.patientBean.id=:patientId")
	List<OpdCasePaperBean> findByPatientId(@Param("patientId") Integer patientId);

}
