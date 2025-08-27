package com.proj.hospitalService.entities.dto;

import lombok.Data;
import lombok.Value;

@Value
public class DoctorResponse {
    Long id;
    String fullName;
    String specialty;
    String phone;
    String email;
    String department;
    java.time.Instant createdAt;
    java.time.Instant updatedAt;
}
