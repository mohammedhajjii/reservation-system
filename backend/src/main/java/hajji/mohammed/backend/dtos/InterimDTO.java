package hajji.mohammed.backend.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data @NoArgsConstructor
public class InterimDTO {
    private Long slotId;
    private Long sessionId;
    private Instant startTime;
    private Instant endTime;
    private Integer maxReservation;
}
