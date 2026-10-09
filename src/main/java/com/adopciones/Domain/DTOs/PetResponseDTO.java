package com.adopciones.Domain.DTOs;

import java.time.LocalDate;

public record PetResponseDTO(
    Long id,
    String name,
    String city,
    int age,
    LocalDate createdAt,
    boolean isAdopted
) {} 