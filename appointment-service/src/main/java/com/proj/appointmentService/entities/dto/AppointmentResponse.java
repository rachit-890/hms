package com.proj.appointmentService.entities.dto;

import lombok.Value;

import java.time.Instant;
import java.time.OffsetDateTime;

@Value
public class AppointmentResponse {

    Long id;
    Long patientId;
    Long doctorId;
    OffsetDateTime startTime;
    OffsetDateTime endTime;
    String status;
    String reason;
    Instant createdAt;
    Instant updatedAt;
}
