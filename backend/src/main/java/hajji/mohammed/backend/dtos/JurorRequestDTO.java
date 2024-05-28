package hajji.mohammed.backend.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor
public class JurorRequestDTO {
    private String name;
    private String email;
    private String speciality;
}
