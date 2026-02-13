package com.example.hospitalmanagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.hospitalmanagement.entity.Patient;

public interface PatientRepository extends JpaRepository<Patient,Integer> {
}
