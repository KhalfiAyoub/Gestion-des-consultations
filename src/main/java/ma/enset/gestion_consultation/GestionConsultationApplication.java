package ma.enset.gestion_consultation;

import ma.enset.gestion_consultation.entity.Consultation;
import ma.enset.gestion_consultation.entity.Patient;
import ma.enset.gestion_consultation.repository.ConsultationRepository;
import ma.enset.gestion_consultation.repository.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.time.Month;

@SpringBootApplication
public class GestionConsultationApplication implements CommandLineRunner {
    PatientRepository patientRepository;
    ConsultationRepository consultationRepository;

    public GestionConsultationApplication(PatientRepository patientRepository, ConsultationRepository consultationRepository) { // تم إضافة فاصلة هنا
        this.patientRepository = patientRepository;
        this.consultationRepository = consultationRepository;
    }

    public static void main(String[] args) {

        SpringApplication.run(GestionConsultationApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Patient patient = new Patient();
        patient.setNom("Ragoubi");
        patient.setPrenom("Ali");
        patient.setEmail("ragoubhi@gmail.com");
        patient.setTel("0687878787");

        patientRepository.save(patient);

        Consultation consultation = new Consultation();
        consultation.setDateConsultation(LocalDate.of(2023, Month.AUGUST, 27)); // Use LocalDate
        consultation.setDescription("Consultation 1");
        consultation.setPatient(patient);

        consultationRepository.save(consultation);

    }
}