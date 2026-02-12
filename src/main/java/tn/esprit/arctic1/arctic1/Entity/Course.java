package tn.esprit.arctic1.arctic1.Entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Course implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCourse; // Clé primaire
    private String emplacement;
    private LocalDate dateCourse;
    @ManyToOne
    @JoinColumn(name = "championnat_id")
    private Championnat championnat;
    @OneToMany(mappedBy = "course")
    private List<Position> positions;

}