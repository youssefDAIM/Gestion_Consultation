package ma.enset.gestionconsultationapp.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.util.List;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPatient;
    @Column(length =100,nullable=false)
    private String nom;
    @Column(length =100,nullable = false)
    private String prenom;
    private Date dateNaissance;
    @Column(length =30)
    private  String email;
    @Column(length =20)
    private String tel;
    @OneToMany(mappedBy = "patient")
    private List<Consultation> consultations;

}
