package com.BichoVacinado.BichoVacinado.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Vacina extends BaseEntity {

    @Column(nullable = false)
    private String nome;
}

