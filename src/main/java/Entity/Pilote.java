package Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;

public class Pilote implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPilote; // Clé primaire
    private String ibelleP;
    private Integer nbPointsTotal;
    private Integer ClassementGeneral;
}
