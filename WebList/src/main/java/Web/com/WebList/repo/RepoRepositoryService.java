package Web.com.WebList.repo;

import Web.com.WebList.db.Service;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepoRepositoryService extends JpaRepository<Service, Long> {
}
