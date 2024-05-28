package hajji.mohammed.backend.entities;

import hajji.mohammed.backend.enums.Degree;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @SuperBuilder @EqualsAndHashCode(callSuper = true)
public class Candidate extends AppUser {
    @Enumerated(EnumType.STRING)
    private Degree degree;
}
