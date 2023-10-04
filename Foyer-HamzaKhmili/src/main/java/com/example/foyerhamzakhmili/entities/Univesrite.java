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

    public Long getIdUnivesity() {
        return idUnivesity;
    }

    public void setIdUnivesity(Long idUnivesity) {
        this.idUnivesity = idUnivesity;
    }

    public String getNomUniversite() {
        return nomUniversite;
    }

    public void setNomUniversite(String nomUniversite) {
        this.nomUniversite = nomUniversite;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
}
