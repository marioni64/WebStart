package Web.com.WebList.repo;

import Web.com.WebList.db.Appointments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepoRepository extends JpaRepository<Appointments, Long> {
}
