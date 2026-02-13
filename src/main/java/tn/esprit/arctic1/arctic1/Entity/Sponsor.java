package tn.esprit.arctic1.arctic1.Entity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.time.LocalDate;
import java.util.List;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Sponsor {

    @Id
    private Long idSponsor;

    private String nom;

    private String pays;

    private Float budgetAnnuel;

    private Boolean bloquerContrat;

    Boolean archived;

    LocalDate dateCreation;

    LocalDate dateDerniereModification;

    @OneToMany(cascade = CascadeType.PERSIST, mappedBy="Sponsor")
    private List<Contrat> contrats;
}

