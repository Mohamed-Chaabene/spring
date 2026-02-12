package tn.esprit.arctic1.arctic1.Entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
public class Championnat implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChampionnat; // Clé primaire
    @Enumerated(EnumType.STRING)
    Categorie categorie;
    private String libelleC;
    private Integer annee;
    @OneToOne(mappedBy = "championnat", cascade = CascadeType.ALL)
    private DetailChampionnat detailChampionnat;
    // Championnat
    @OneToMany(mappedBy = "championnat")
    private List<Course> courses;

}