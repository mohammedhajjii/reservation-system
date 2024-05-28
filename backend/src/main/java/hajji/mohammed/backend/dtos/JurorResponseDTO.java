package hajji.mohammed.backend.dtos;

import hajji.mohammed.backend.enums.UserRole;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor
public class JurorResponseDTO {
    private String id;
    private String name;
    private String username;
    private String email;
}
