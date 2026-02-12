package tn.esprit.arctic1.arctic1.Entity;

import jakarta.persistence.*;

import java.io.Serializable;
@Entity
public class Pilote implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPilote; // Clé primaire
    private String ibelleP;
    private Integer nbPointsTotal;
    private Integer ClassementGeneral;
    @ManyToOne
    @JoinColumn(name = "equipe_id")
    private Equipe equipe;

}
