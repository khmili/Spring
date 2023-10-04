package com.example.foyerhamzakhmili.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "Universite")
public class Univesrite implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUnivesity;
    @Column (name = "nomUniversite")
    private String nomUniversite;
    @Column (name="addresse")
    private String adresse;

}
