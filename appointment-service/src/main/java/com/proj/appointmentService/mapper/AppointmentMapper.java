package com.proj.appointmentService.mapper;

import com.proj.appointmentService.entities.Appointment;
import com.proj.appointmentService.entities.dto.AppointmentCreateRequest;
import com.proj.appointmentService.entities.dto.AppointmentResponse;
import com.proj.appointmentService.entities.dto.AppointmentUpdateRequest;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface AppointmentMapper {

    @Mapping(target = "status", constant = "BOOKED")
    Appointment toEntity(AppointmentCreateRequest dto);

    AppointmentResponse toResponse(Appointment entity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateEntity(@MappingTarget Appointment entity, AppointmentUpdateRequest dto);
}
