package com.proj.patient_service.entities.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PatientUpdateRequestDto {
    @Size(max = 120)
    private String fullName;

    @Size(max = 64)
    private String gender;

    @Size(max = 20)
    private String phone;

    @Email
    @Size(max = 160)
    private String email;

    @Size(max = 240)
    private String address;

    @Past
    private java.time.LocalDate dateOfBirth;
}
