package tn.esprit.arctic1.arctic1.Entity;

import jakarta.persistence.*;
@Entity
public class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPosition; // Clé primaire
    private Integer classement;
    private Integer nbPoints;
    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;


}
