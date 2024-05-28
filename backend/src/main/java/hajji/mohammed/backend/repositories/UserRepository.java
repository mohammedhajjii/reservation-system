package hajji.mohammed.backend.repositories;

import hajji.mohammed.backend.entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<AppUser, String> {
}
