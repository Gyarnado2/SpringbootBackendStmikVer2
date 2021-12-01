package net.javaguides.springboot.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import net.javaguides.springboot.model.Leaveofabsence;
	
	@Repository
	public interface LeaveofabsenceRepository extends JpaRepository<Leaveofabsence, Long>{

}
