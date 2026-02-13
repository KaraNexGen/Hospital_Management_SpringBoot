package com.example.hospitalmanagement.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.hospitalmanagement.Repository.PatientRepository;
import com.example.hospitalmanagement.entity.Patient;

@Service
public class PatientService {

    @Autowired
    PatientRepository repo;

    public Patient savePatient(Patient p){
        return repo.save(p);
    }

    public List<Patient> getAllPatients(){
        return repo.findAll();
    }

    public Patient getPatientById(int id){
        return repo.findById(id).orElse(null);
    }

    public Patient updatePatient(Patient p){
        return repo.save(p);
    }

    public String deletePatient(int id){
        repo.deleteById(id);
        return "Patient Deleted";
    }
}
