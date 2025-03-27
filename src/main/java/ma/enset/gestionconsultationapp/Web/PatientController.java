package ma.enset.gestionconsultationapp.Web;

import ma.enset.gestionconsultationapp.Entity.Patient;
import ma.enset.gestionconsultationapp.Service.CabinetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller()
@RequestMapping("/patients")
public class PatientController {
    private CabinetService cabinetService;

    public PatientController(CabinetService cabinetService) {
        this.cabinetService = cabinetService;
    }
    @GetMapping
    public String getPatient(Model model) {
        List<Patient> patients = cabinetService.getAllPatients();
        model.addAttribute("patients", patients);
        return "patients";
    }
    @GetMapping("/new")
    public String newPatients(Model model) {
        model.addAttribute("patient", new Patient());
        return "add_patient";
    }
    @PostMapping
    public String savePatient(@ModelAttribute Patient patient) {
        cabinetService.savePatient(patient);
        return "redirect:/patients";
    }
    @GetMapping("/delete/{id}")
    public String deletePatient(@PathVariable("id") long  id) {
        cabinetService.deletePatientById(id);
        return "redirect:/patients";
    }
    @GetMapping("/edit/{id}")
    public String editPatient(Model model,@PathVariable("id") long  id) {
        Patient patient = cabinetService.getPatientById(id);
        model.getAttribute("patient");
        return "edit_patient";
    }
}
