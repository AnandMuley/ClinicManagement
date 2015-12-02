package com.icare.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.icare.entities.AppointmentBean;

public interface AppointmentRepository extends
		JpaRepository<AppointmentBean, Integer> {

	@Query(value = "SELECT apts FROM AppointmentBean apts WHERE apts.date=:forDate")
	List<AppointmentBean> findByDate(@Param("forDate") Date forDate);

}
