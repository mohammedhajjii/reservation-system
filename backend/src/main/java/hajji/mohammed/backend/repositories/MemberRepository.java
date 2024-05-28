package hajji.mohammed.backend.repositories;

import hajji.mohammed.backend.entities.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long> {

    List<Member> findBySessionId(Long sessionId);
    List<Member> findByJurorId(String jurorId);
}
