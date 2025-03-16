package ma.enset.gestion_consultation.repository;

import ma.enset.gestion_consultation.entity.Consultation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ConsultationRepository extends JpaRepository<Consultation, Long> {

    List<Consultation> findAllByPatient_IdPatient(Long patientId); // nouvelle méthode!
}