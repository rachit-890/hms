package com.proj.appointmentService.entities.dto;


import jakarta.validation.constraints.*;
import lombok.Data;
import java.time.OffsetDateTime;

@Data
public class AppointmentCreateRequest {
    @NotNull
    private Long patientId;

    @NotNull
    private Long doctorId;

    @NotNull
    private OffsetDateTime startTime;

    @NotNull
    private OffsetDateTime endTime;

    @Size(max = 240)
    private String reason;
}
