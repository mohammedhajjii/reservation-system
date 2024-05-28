package hajji.mohammed.backend.entities;


import hajji.mohammed.backend.enums.ReservationStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer orderNum;
    @Enumerated(EnumType.STRING)
    private ReservationStatus reservationStatus;

    //relations:
    @ManyToOne
    private Interim interim;
    @ManyToOne
    private Candidate candidate;
}
