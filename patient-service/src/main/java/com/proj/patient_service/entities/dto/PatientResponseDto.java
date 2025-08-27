package com.proj.patient_service.entities.dto;

import lombok.Value;

import java.time.Instant;
import java.time.LocalDate;

@Value
public class PatientResponseDto {
    Long id;
    String fullName;
    String gender;
    String phone;
    String email;
    String address;
    LocalDate dateOfBirth;
    Instant createdAt;
    Instant updatedAt;
}