package com.adopciones.Web.Controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adopciones.Domain.DTOs.PetResponseDTO;
import com.adopciones.Domain.Service.PetService;
import com.adopciones.Persistence.Model.Pet;

@RestController 
@RequestMapping("/pets")
public class PetController {
    
    private final PetService petService;

    public PetController(PetService petService) {
        this.petService = petService;
    }

    @GetMapping
    public ResponseEntity<List<PetResponseDTO>> getAllPets() {
        return ResponseEntity.ok(petService.getAllPets());
    }


}
