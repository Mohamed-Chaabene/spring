package Entity;
import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Date;
@Entity
public class Sponsor implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSponsor; // Clé primaire
    private String name;
    private String pays;
    private Float budgetAnnuel;
    private Boolean BloquerContrat;
}
