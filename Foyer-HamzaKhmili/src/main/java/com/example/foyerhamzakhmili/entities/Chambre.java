package com.example.foyerhamzakhmili.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Chambre implements Serializable {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long idChambre;
private Long numeroChambre;

    @Enumerated(EnumType.STRING)
    private TypeChambre TypeChambre;

    public Long getIdChambre() {
        return idChambre;
    }

    public void setIdChambre(Long idChambre) {
        this.idChambre = idChambre;
    }

    public Long getNumeroChambre() {
        return numeroChambre;
    }

    public void setNumeroChambre(Long numeroChambre) {
        this.numeroChambre = numeroChambre;
    }

    public com.example.foyerhamzakhmili.entities.TypeChambre getTypeChambre() {
        return TypeChambre;
    }

    public void setTypeChambre(com.example.foyerhamzakhmili.entities.TypeChambre typeChambre) {
        TypeChambre = typeChambre;
    }
}
