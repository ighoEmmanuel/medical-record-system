package com.onemedic.controllers;

import com.onemedic.models.Patient;
import com.onemedic.services.impl.PatientService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/patients")
public class PatientController {

    private final PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @GetMapping
    public Page<Patient> getAllPatients(Pageable pageable) {
        return patientService.getAllPatients(pageable);
    }


}
//how to expose DTOs