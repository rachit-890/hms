package com.proj.hospitalService.entities.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class DoctorUpdateRequest {
    @Size(max = 120)
    private String fullName;

    @Size(max = 120)
    private String specialty;

    @Size(max = 20)
    private String phone;

    @Email
    @Size(max = 160)
    private String email;

    @Size(max = 120)
    private String department;
}