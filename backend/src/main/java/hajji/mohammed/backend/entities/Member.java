package hajji.mohammed.backend.entities;

import hajji.mohammed.backend.enums.JurorRole;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    private JurorRole jurorJurorRole;

    @ManyToOne
    private Session session;
    @ManyToOne
    private Juror juror;
}
