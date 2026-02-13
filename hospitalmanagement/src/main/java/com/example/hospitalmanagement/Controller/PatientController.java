package com.example.hospitalmanagement.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.hospitalmanagement.entity.Patient;
import com.example.hospitalmanagement.service.PatientService;

@RestController
@RequestMapping("/patient")
public class PatientController {

    @Autowired
    PatientService service;

    @PostMapping("/add")
    public Patient addPatient(@RequestBody Patient p){
        return service.savePatient(p);
    }

    @GetMapping("/all")
    public List<Patient> getAll(){
        return service.getAllPatients();
    }

    @GetMapping("/{id}")
    public Patient getById(@PathVariable int id){
        return service.getPatientById(id);
    }

    @PutMapping("/update")
    public Patient update(@RequestBody Patient p){
        return service.updatePatient(p);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id){
        return service.deletePatient(id);
    }
}
