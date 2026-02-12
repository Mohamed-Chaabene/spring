package tn.esprit.arctic1.arctic1.Entity;
import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Equipe implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEquipe; // Clé primaire
    private String libelle;
    private Integer nbPointsTotal;
    private Integer ClassementGerenal;
    @OneToMany(mappedBy = "equipe", cascade = CascadeType.ALL)
    private List<Pilote> pilotes;
    @OneToMany(mappedBy = "equipe")
    private List<Contrat> contrats;

}

