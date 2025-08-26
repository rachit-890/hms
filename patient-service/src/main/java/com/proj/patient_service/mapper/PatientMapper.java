package com.proj.patient_service.mapper;

import com.proj.patient_service.entities.Patient;
import com.proj.patient_service.entities.dto.PatientCreateRequestDto;
import com.proj.patient_service.entities.dto.PatientResponseDto;
import com.proj.patient_service.entities.dto.PatientUpdateRequestDto;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface PatientMapper {

    Patient toEntity(PatientCreateRequestDto dto);

    PatientResponseDto toResponse(Patient entity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateEntity(@MappingTarget Patient entity, PatientUpdateRequestDto dto);
}

