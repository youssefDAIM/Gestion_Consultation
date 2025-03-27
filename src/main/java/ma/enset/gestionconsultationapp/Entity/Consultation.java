package ma.enset.gestionconsultationapp.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Consultation {
    @Id
    private Long idconsultation;
    private Date dateConsultation;
    private  String Description ;
    @ManyToOne
    private Patient patient;
/*
    public Consultation(Long idconsultation, Date dateConsultation, String description, Patient patient) {
        this.idconsultation = idconsultation;
        this.dateConsultation = dateConsultation;
        Description = description;
        this.patient = patient;
    }

    public Consultation() {
    }

    public Long getIdconsultation() {
        return idconsultation;
    }

    public Date getDateConsultation() {
        return dateConsultation;
    }

    public String getDescription() {
        return Description;
    }

    public Patient getPatient() {
        return patient;
    }*/

    public void setIdconsultation(Long idconsultation) {
        this.idconsultation = idconsultation;
    }

    public void setDateConsultation(Date dateConsultation) {
        this.dateConsultation = dateConsultation;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
}
