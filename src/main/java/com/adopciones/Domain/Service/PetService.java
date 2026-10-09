package com.adopciones.Domain.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.adopciones.Domain.DTOs.PetResponseDTO;
import com.adopciones.Domain.Exceptions.NotFoundException;
import com.adopciones.Persistence.Repository.PetRepositoryImpl;

@Service 
public class PetService {

    private final PetRepositoryImpl petRepository;

    public PetService(PetRepositoryImpl petRepository) {
        this.petRepository = petRepository;
    }

    public List<PetResponseDTO> getAllPets() {
        var pets = petRepository.findAll();
        if (pets.isEmpty()) {
            throw new NotFoundException("No pets found");
        }
        return pets;
    }
    
}
