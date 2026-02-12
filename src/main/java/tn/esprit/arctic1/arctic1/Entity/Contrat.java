package tn.esprit.arctic1.arctic1.Entity;
import jakarta.persistence.*;
import java.io.Serializable;

@Entity
public class Contrat implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idContrat; // Clé primaire
    private Float moment;
    private String annee;
    private Boolean archived;
    @ManyToOne
    @JoinColumn(name = "sponsor_id")
    private Sponsor sponsor;
    @ManyToOne
    @JoinColumn(name = "equipe_id")
    private Equipe equipe;

}

