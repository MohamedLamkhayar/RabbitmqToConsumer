package com.udemy.Lamkhayarconsumer.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "ETUDIANT")
public class Etudiant implements Serializable {
    @Id
    @GeneratedValue
    private Long idEtudiant;
    private String nom;
    private String prenom;
    private int age;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dateReception;
}
