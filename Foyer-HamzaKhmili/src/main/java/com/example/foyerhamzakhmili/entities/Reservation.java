package com.example.foyerhamzakhmili.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table (name = ("Reservation"))
public class Reservation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String idReservation;

    private Date anneeUniversitaire;

    private boolean estvalide;

}
