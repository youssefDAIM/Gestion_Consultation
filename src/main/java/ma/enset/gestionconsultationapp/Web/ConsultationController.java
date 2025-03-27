package ma.enset.gestionconsultationapp.Web;

import ma.enset.gestionconsultationapp.Entity.Patient;
import org.springframework.ui.Model;
import ma.enset.gestionconsultationapp.Entity.Consultation;
import ma.enset.gestionconsultationapp.Service.CabinetService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/consultations")
public class ConsultationController {
    private final CabinetService cabinetService;

    public ConsultationController(CabinetService cabinetService) {
        this.cabinetService = cabinetService;
    }

    @GetMapping
    public String getAllConsultations(Model model) {
        List<Consultation> consultations = cabinetService.getAllConsultations();
        model.addAttribute("consultations", consultations);
        return "consultations";
    }
    @GetMapping("/new")
    public String NewConsultation(Model model) {
        List<Patient> patients = cabinetService.getAllPatients();
        Consultation consultation = new Consultation();
        model.addAttribute("patients", patients);
        model.addAttribute("consultation", consultation);
        return "add_consultation";
    }
    @PostMapping
    public String saveConsultation(@ModelAttribute Consultation consultation, @RequestParam long idPatient) {
        cabinetService.addConsultation(consultation, idPatient);

        return "redirect:/consultations/";


    }
}