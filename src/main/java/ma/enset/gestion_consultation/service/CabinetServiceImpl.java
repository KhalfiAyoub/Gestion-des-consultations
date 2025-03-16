package ma.enset.gestion_consultation.service;

import ma.enset.gestion_consultation.entity.Consultation;
import ma.enset.gestion_consultation.entity.Patient;
import ma.enset.gestion_consultation.repository.ConsultationRepository;
import ma.enset.gestion_consultation.repository.PatientRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CabinetServiceImpl implements CabinetService {
    private final PatientRepository patientRepository;
    private final ConsultationRepository consultationRepository;

    public CabinetServiceImpl(PatientRepository patientRepository, ConsultationRepository consultationRepository) {
        this.patientRepository = patientRepository;
        this.consultationRepository = consultationRepository;
    }

    @Override
    public void addPatient(Patient patient) {
        patientRepository.save(patient);
    }

    @Override
    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    @Override
    public void updatePatient(Long id, Patient updatedPatient) {
        Patient existingPatient = patientRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Patient introuvable"));
        existingPatient.setNom(updatedPatient.getNom());
        existingPatient.setPrenom(updatedPatient.getPrenom());
        existingPatient.setEmail(updatedPatient.getEmail());
        existingPatient.setTel(updatedPatient.getTel());
        patientRepository.save(existingPatient);
    }

    @Override
    @Transactional // مهم لضمان عملية الحذف الكاملة
    public void deletePatientById(Long id) {
        Patient patient = patientRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Patient introuvable"));

        // Suppression des consultations associées au patient
        List<Consultation> consultations = consultationRepository.findAllByPatient_IdPatient(id); //Correctif ici !
        consultationRepository.deleteAll(consultations);

        // Suppression du patient
        patientRepository.delete(patient);
    }

    @Override
    public List<Consultation> getAllConsultation() {
        return consultationRepository.findAll();
    }

    @Override
    public void AddConsultation(Consultation consultation) {
        consultationRepository.save(consultation);
    }

    @Override
    public void updateConsultation(Long id, Consultation updatedConsultation) {
        Consultation existingConsultation = consultationRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Consultation introuvable"));
        existingConsultation.setDateConsultation(updatedConsultation.getDateConsultation());
        existingConsultation.setDescription(updatedConsultation.getDescription());
        existingConsultation.setPatient(updatedConsultation.getPatient());
        consultationRepository.save(existingConsultation);
    }

    @Override
    public void deleteConsultationById(Long id) {
        consultationRepository.deleteById(id);
    }
}