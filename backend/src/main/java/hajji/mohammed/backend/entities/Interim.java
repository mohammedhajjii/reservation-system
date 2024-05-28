package hajji.mohammed.backend.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.Instant;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class Interim {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Temporal(TemporalType.TIME)
    private Instant startTime;
    @Temporal(TemporalType.TIME)
    private Instant endTime;
    private Integer maxReservation;
    @ManyToOne
    private Session session;
}
