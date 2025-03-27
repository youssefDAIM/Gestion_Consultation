package ma.enset.gestionconsultationapp.Repository;
import  ma.enset.gestionconsultationapp.Entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PatientRepository extends JpaRepository<Patient,Long>{
}
