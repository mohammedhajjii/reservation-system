package hajji.mohammed.backend.dtos;

import hajji.mohammed.backend.enums.SessionPeriod;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data @NoArgsConstructor
public class SessionDTO {
    private Long id;
    private Date sessionDate;
    private SessionPeriod sessionPeriod;
}
