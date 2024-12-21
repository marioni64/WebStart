package Web.com.WebList.repo;

import Web.com.WebList.db.Register;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegisterJPA extends JpaRepository<Register, Long> {

}
