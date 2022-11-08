package sapronov.repository;

import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import sapronov.entity.Patient;
public interface PatientRepository extends JpaRepository<Patient, Long> {

}
