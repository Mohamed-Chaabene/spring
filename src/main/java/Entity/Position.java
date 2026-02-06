package Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPosition; // Clé primaire
    private Integer classement;
    private Integer nbPoints;

}
