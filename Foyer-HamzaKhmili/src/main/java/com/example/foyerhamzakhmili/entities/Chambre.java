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

}
