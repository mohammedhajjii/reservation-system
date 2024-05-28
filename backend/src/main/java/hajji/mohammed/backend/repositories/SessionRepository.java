package hajji.mohammed.backend.repositories;

import hajji.mohammed.backend.entities.Session;
import hajji.mohammed.backend.enums.SessionPeriod;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface SessionRepository extends JpaRepository<Session, Long> {

    List<Session> findBySessionDateAndSessionPeriod(Date sessionDate, SessionPeriod sessionPeriod);
}
