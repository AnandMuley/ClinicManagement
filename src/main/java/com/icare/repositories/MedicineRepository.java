package com.icare.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.icare.entities.Medicine;

public interface MedicineRepository extends JpaRepository<Medicine, Integer> {

}
