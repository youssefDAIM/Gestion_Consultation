package ma.enset.gestionconsultationapp;

import lombok.Data;
import ma.enset.gestionconsultationapp.Entity.Consultation;
import ma.enset.gestionconsultationapp.Entity.Patient;
import ma.enset.gestionconsultationapp.Repository.ConsultationRepository;
import ma.enset.gestionconsultationapp.Repository.PatientRepository;
import org.hibernate.sql.results.spi.LoadContexts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Date;
import java.time.LocalDate;
import java.time.Month;

@SpringBootApplication
public class GestionConsultationAppApplication implements CommandLineRunner {

    @Autowired
    PatientRepository patientRepository;
    ConsultationRepository consultationRepository;

    public GestionConsultationAppApplication(PatientRepository patientRepository, ConsultationRepository consultationRepository) {
        this.patientRepository = patientRepository;
        this.consultationRepository = consultationRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(GestionConsultationAppApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        //ajouter un patient
      /*  Patient patient = new Patient();
        patient.setNom("DAIM");
        patient.setPrenom("Youssef");
        patient.setEmail("daimyoussef@gmail.com");
        patient.setTel("1234567890");
        patientRepository.save(patient);*/

        Patient patient = patientRepository.findById(2L).get();
      /*  patient.setNom("ABOUDA");
        patient.setPrenom("Ahmed");
        patient.setEmail("aboudaahmed@gmail.com");
        patient.setTel("0987654321");
        patientRepository.save(patient);
        Consultation consultation = new Consultation();
        Date date = Date.valueOf(LocalDate.of(2024, Month.APRIL,23));
        consultation.setDateConsultation(date);
        consultation.setDescription("Consultation 1");
        consultation.setPatient(patient);
        consultationRepository.save(consultation);*/
    }
}
