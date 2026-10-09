package com.adopciones.Domain.Repository;

import java.util.List;

import com.adopciones.Domain.DTOs.PetResponseDTO;
import com.adopciones.Persistence.Model.Pet;

public interface PetRepository {
    List<PetResponseDTO> findAll();
}
