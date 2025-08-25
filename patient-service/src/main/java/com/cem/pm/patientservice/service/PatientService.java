package com.cem.pm.patientservice.service;

import com.cem.pm.patientservice.dto.PatientRequestDTO;
import com.cem.pm.patientservice.dto.PatientResponseDTO;
import com.cem.pm.patientservice.mapper.PatientMapper;
import com.cem.pm.patientservice.model.Patient;
import com.cem.pm.patientservice.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PatientService {

    private final PatientRepository patientRepository;

    public List<PatientResponseDTO> getPatients() {
        List<Patient> patients = patientRepository.findAll();

        return patients.stream()
                .map(PatientMapper::toDTO)
                .collect(Collectors.toList());
    }

    public PatientResponseDTO createPatient(PatientRequestDTO patientRequestDTO) {
        
    }

}
