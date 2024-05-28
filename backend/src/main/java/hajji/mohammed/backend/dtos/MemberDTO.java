package hajji.mohammed.backend.dtos;

import hajji.mohammed.backend.enums.JurorRole;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor
public class MemberDTO {
    private Long sessionId;
    private String JurorId;
    private JurorRole jurorRole;
}
