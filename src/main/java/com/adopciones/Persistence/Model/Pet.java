package com.adopciones.Persistence.Model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table (name = "pets")
public class Pet {
    @Id
    private Long id;
    private String name;
    private String city;
    private int age;

    @Column(name = "is_adopted", nullable = false)
    private boolean isAdopted;

    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDate createdAt;
}
