package com.sena.db;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "deportes")
@Data


public class Deportes {
    @Id
    private Integer id;
    @Column(name = "nombre_deporte")
    private String nombreDeporte;
}
