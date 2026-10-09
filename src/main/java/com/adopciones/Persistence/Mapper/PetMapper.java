package com.adopciones.Persistence.Mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.MapperConfig;

import com.adopciones.Domain.DTOs.PetResponseDTO;
import com.adopciones.Persistence.Model.Pet;

@Mapper(componentModel = "spring")
public interface PetMapper {
    
    /// map Pet to PetResponseDTO
    PetResponseDTO toPetResponseDTO(Pet pet);
    List<PetResponseDTO> toPetResponseDTOList(List<Pet> pets);
}
