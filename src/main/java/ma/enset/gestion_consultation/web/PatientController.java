package ma.enset.gestion_consultation.web;

import ma.enset.gestion_consultation.entity.Patient;
import ma.enset.gestion_consultation.repository.PatientRepository;
import ma.enset.gestion_consultation.service.CabinetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PatientController {
    private final CabinetService cabinetService;
    private final PatientRepository patientRepository;

    public PatientController(CabinetService cabinetService, PatientRepository patientRepository) {
        this.cabinetService = cabinetService;
        this.patientRepository = patientRepository;
    }

    @GetMapping("/")
    public String accueil() {
        return "accueil";
    }

    // عرض جميع المرضى
    @GetMapping("/patients")
    public String getPatients(Model model) {
        model.addAttribute("patients", cabinetService.getAllPatients());
        return "patients";
    }

    // نموذج إضافة مريض
    @GetMapping("/patients/new")
    public String newPatient(Model model) {
        model.addAttribute("patient", new Patient());
        return "add_patient";
    }


    @PostMapping("/patients")
    public String addPatient(@ModelAttribute Patient patient) {
        cabinetService.addPatient(patient);
        return "redirect:/patients";
    }

    @GetMapping("/patients/edit/{id}")
    public String editPatientForm(@PathVariable Long id, Model model) {
        Patient patient = patientRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("id error " + id));
        model.addAttribute("patient", patient);
        return "edit_patient";
    }

    @PostMapping("/patients/{id}")
    public String updatePatient(@PathVariable Long id, @ModelAttribute Patient patient) {
        cabinetService.updatePatient(id, patient);
        return "redirect:/patients";
    }

    @GetMapping("/patients/delete/{id}")
    public String deletePatient(@PathVariable Long id) {
        cabinetService.deletePatientById(id);
        return "redirect:/patients";
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }
}