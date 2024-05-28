package hajji.mohammed.backend.entities;

import hajji.mohammed.backend.enums.SessionPeriod;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class Session {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Temporal(TemporalType.DATE)
    private Date sessionDate;
    @Enumerated(EnumType.STRING)
    private SessionPeriod sessionPeriod;
    private Integer roomNum;
}
