package ma.enset.gestionconsultationapp.Service;

import ma.enset.gestionconsultationapp.Entity.Consultation;
import ma.enset.gestionconsultationapp.Entity.Patient;
import ma.enset.gestionconsultationapp.Repository.ConsultationRepository;
import ma.enset.gestionconsultationapp.Repository.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CabinetServiceImpl  implements CabinetService{
    private PatientRepository patientRepository;
    private ConsultationRepository consultationRepository;

    public CabinetServiceImpl(PatientRepository patientRepository, ConsultationRepository consultationRepository) {
        this.patientRepository = patientRepository;
        this.consultationRepository = consultationRepository;
    }

    @Override
    public void addPatient(Patient patient) {
        patientRepository.save(patient);
    }

    @Override
    public void savePatient(Patient patient) {

    }

    @Override
    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    @Override
    public void updatePatient(Patient patient) {
        patientRepository.save(patient);
    }
    @Override
    public void deletePatient(Patient patient) {
        patientRepository.delete(patient);
    }

    @Override
    public void deletePatientById(long id) {
        patientRepository.deleteById(id);
    }

    @Override
    public Patient getPatientById(long id) {
        return patientRepository.findById(id).get();
    }

    @Override
    public void addConsultation(Consultation consultation,Long idPatient) {
       Patient patient= patientRepository.findById(idPatient).get();
       consultation.setPatient(patient);
        consultationRepository.save(consultation);
    }

    @Override
    public List<Consultation> getAllConsultations() {

        return consultationRepository.findAll();
    }
}
