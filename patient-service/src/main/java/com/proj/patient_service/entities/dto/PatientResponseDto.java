package com.proj.patient_service.entities.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
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