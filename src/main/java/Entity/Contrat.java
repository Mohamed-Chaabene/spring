package Entity;
import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Date;
@Entity
public class Contrat implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idContrat; // Clé primaire
    private Float moment;
    private String annee;
    private Boolean archived;
}

