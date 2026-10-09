package com.adopciones.Persistence.CRUD;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.adopciones.Persistence.Model.Pet;

public interface PetCRUD  extends JpaRepository<Pet, Long> {

    // query to get all pets from the database
    @Query("SELECT p FROM Pet p")
    List<Pet> findAll();

}
