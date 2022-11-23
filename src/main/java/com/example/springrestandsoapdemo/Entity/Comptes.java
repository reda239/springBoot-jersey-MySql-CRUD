package com.example.springrestandsoapdemo.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "compete")
public class Comptes {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCompte")
    private  Long id;
    @Column(name = "solde")
    private double solde;
    @Column(name = "dateDeCreationDuCompete")
    @Temporal(TemporalType.DATE)
    private Date dateCreation;
    @Enumerated(EnumType.STRING)
    @Column(name = "typeDeCompte")
    private TypeCompte type;
}
