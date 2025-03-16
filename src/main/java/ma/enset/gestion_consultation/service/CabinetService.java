package ma.enset.gestion_consultation.service;

import ma.enset.gestion_consultation.entity.Consultation;
import ma.enset.gestion_consultation.entity.Patient;
import java.util.List;

public interface CabinetService {
    void addPatient(Patient patient);
    List<Patient> getAllPatients();
    void updatePatient(Long id, Patient updatedPatient);
    void deletePatientById(Long id);
    void AddConsultation(Consultation consultation);
    List<Consultation> getAllConsultation();
    void updateConsultation(Long id, Consultation consultation);
    void deleteConsultationById(Long id);
}