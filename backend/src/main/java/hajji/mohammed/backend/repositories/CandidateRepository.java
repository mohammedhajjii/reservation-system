package hajji.mohammed.backend.repositories;

import hajji.mohammed.backend.entities.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateRepository extends JpaRepository<Candidate, String> {
}
