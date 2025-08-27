package com.proj.hospitalService.mapper;

import com.proj.hospitalService.entities.Doctor;
import com.proj.hospitalService.entities.dto.DoctorCreateRequest;
import com.proj.hospitalService.entities.dto.DoctorResponse;
import com.proj.hospitalService.entities.dto.DoctorUpdateRequest;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring")
public interface DoctorMapper {
    Doctor toEntity(DoctorCreateRequest dto);
    DoctorResponse toResponse(Doctor entity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateEntity(@MappingTarget Doctor entity, DoctorUpdateRequest dto);
}
