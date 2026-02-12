package tn.esprit.arctic1.arctic1.Entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class DetailChampionnat implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDetailChompionnat; // Clé primaire
    private String code;
    private String description;
    @OneToOne
    @JoinColumn(name = "championnat_id")
    private Championnat championnat;

}