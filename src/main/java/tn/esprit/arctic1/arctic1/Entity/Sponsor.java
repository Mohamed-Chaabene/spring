package tn.esprit.arctic1.arctic1.Entity;
import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Sponsor implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSponsor; // Clé primaire
    private String name;
    private String pays;
    private Float budgetAnnuel;
    private Boolean BloquerContrat;
    @OneToMany(mappedBy = "sponsor", cascade = CascadeType.ALL)
    private List<Contrat> contrats;

}
