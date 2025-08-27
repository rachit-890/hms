package com.proj.appointmentService.entities.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class AppointmentUpdateRequest {
    @NotNull
    private Long id;

    @Size(max = 24)
    private String status;

    @Size(max = 240)
    private String reason;
}
