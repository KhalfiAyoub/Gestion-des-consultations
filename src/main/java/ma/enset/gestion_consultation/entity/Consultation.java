package ma.enset.gestion_consultation.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate; // import LocalDate

@Entity
@Data
public class Consultation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idConsultation;
    private LocalDate dateConsultation; // utilisation de LocalDate
    private String description;
    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

}