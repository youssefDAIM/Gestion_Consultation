package ma.enset.gestionconsultationapp.Service;
import ma.enset.gestionconsultationapp.Entity.Consultation;
import ma.enset.gestionconsultationapp.Entity.Patient;

import java.util.List;

public interface CabinetService {
    void addPatient(Patient patient);

    //gestion Patient
    void savePatient(Patient patient);
    List<Patient> getAllPatients();

    void updatePatient(Patient patient);

    void deletePatient(Patient patient);
    void deletePatientById(long id);
    Patient getPatientById(long id);
    //gestion Consultation
    void addConsultation(Consultation consultation,Long idPatient);
    List<Consultation> getAllConsultations();
}
