package com.proj.patient_service.entities.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PatientCreateRequestDto {

    @NotBlank @Size(max = 120)
    private String fullName;

    @Size(max = 64)
    private String gender;

    @Size(max = 20)
    private String phone;

    @Email @Size(max = 160)
    private String email;

    @Size(max = 240)
    private String address;

    @Past
    private java.time.LocalDate dateOfBirth;
}
