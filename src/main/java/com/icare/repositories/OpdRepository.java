package com.icare.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.icare.entities.OpdCasePaperBean;

public interface OpdRepository extends JpaRepository<OpdCasePaperBean, Integer> {

}
