package com.adopciones.Persistence.Repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.adopciones.Domain.DTOs.PetResponseDTO;
import com.adopciones.Domain.Repository.PetRepository;
import com.adopciones.Persistence.CRUD.PetCRUD;
import com.adopciones.Persistence.Mapper.PetMapper;
import com.adopciones.Persistence.Model.Pet;

@Repository 
public class PetRepositoryImpl implements PetRepository {

    private final PetCRUD petCRUD;
    private final PetMapper petMapper;

    public PetRepositoryImpl(PetCRUD petCRUD, PetMapper petMapper) {
        this.petCRUD = petCRUD;
        this.petMapper = petMapper;
    }

    @Override
    public List<PetResponseDTO> findAll() {
        var pets = petCRUD.findAll();
        return petMapper.toPetResponseDTOList(pets);
    }

}
    
    
    

