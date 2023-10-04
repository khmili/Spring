package com.example.foyerhamzakhmili.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table (name = "Etudiant")
public class Etudiant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEtudiant;
    @Column (name = "nomEt")
    private String nomEt;
    @Column (name="prenomEt")
    private String prenomEt;
    @Column (name="cin")
    private Long cin;
    @Column (name = "ecole")
    private String ecole;
    @Column (name = "dateNaissance")
    private Date dateNaissance;


}
