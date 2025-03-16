package ma.enset.gestion_consultation.web;

import ma.enset.gestion_consultation.entity.Consultation;
import ma.enset.gestion_consultation.entity.Patient;
import ma.enset.gestion_consultation.service.CabinetService;
import ma.enset.gestion_consultation.repository.PatientRepository; // Import PatientRepository
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/consultations")
public class ConsultationController {
    private final CabinetService cabinetService;
    private final PatientRepository patientRepository; // Inject PatientRepository

    public ConsultationController(CabinetService cabinetService, PatientRepository patientRepository) {
        this.cabinetService = cabinetService;
        this.patientRepository = patientRepository;
    }

    @GetMapping
    public String getAllConsultations(Model model) {
        model.addAttribute("consultations", cabinetService.getAllConsultation());
        return "consultations"; // Assurez-vous que le nom du template correspond au fichier HTML
    }

    @GetMapping("/new")
    public String newConsultationForm(Model model) {
        Consultation consultation = new Consultation();
        model.addAttribute("consultation", consultation);
        model.addAttribute("patients", cabinetService.getAllPatients());
        return "add_consultation";
    }

    @PostMapping
    public String addConsultation(@ModelAttribute Consultation consultation) {
        // Vérifiez que le patient existe réellement
        Patient patient = patientRepository.findById(consultation.getPatient().getIdPatient())
                .orElseThrow(() -> new IllegalArgumentException("ID du patient invalide"));

        // Assignez le patient à la consultation
        consultation.setPatient(patient);

        cabinetService.AddConsultation(consultation);
        return "redirect:/consultations";
    }

    @GetMapping("/edit/{id}")
    public String editConsultationForm(@PathVariable Long id, Model model) {
        Consultation consultation = cabinetService.getAllConsultation().stream()
                .filter(c -> c.getIdConsultation().equals(id))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("ID de consultation invalide : " + id));
        model.addAttribute("consultation", consultation);
        model.addAttribute("patients", cabinetService.getAllPatients());
        return "edit_consultation";
    }

    @PostMapping("/{id}")
    public String updateConsultation(@PathVariable Long id, @ModelAttribute Consultation consultation) {
        cabinetService.updateConsultation(id, consultation);
        return "redirect:/consultations";
    }

    @GetMapping("/delete/{id}")
    public String deleteConsultation(@PathVariable Long id) {
        cabinetService.deleteConsultationById(id);
        return "redirect:/consultations";
    }
}