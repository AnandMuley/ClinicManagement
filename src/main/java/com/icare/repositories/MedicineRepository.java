package com.icare.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.icare.entities.Medicine;

public interface MedicineRepository extends JpaRepository<Medicine, Integer> {

	List<Medicine> findByNameContaining(String name);

}
