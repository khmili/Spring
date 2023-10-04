package com.example.foyerhamzakhmili.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name="Foyer")
public class Foyer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idFoyer ;
    @Column (name="NomFoyer")
    private String NomFoyer ;
    @Column (name="capaciteFoyer")
    private Long capaciteFoyer;
}
