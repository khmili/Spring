package com.example.foyerhamzakhmili.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity

public class Bloc implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idBloc ;

    private String NomBloc ;

    private Long capaciteBloc;
}
