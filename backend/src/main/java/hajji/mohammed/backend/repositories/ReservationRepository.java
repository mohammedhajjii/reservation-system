package hajji.mohammed.backend.repositories;

import hajji.mohammed.backend.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

    //List<Reservation> findByInterimId(Long slotId);
    List<Reservation> findByCandidateId(String candidateId);

}
