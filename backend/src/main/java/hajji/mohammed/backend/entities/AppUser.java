package hajji.mohammed.backend.entities;


import hajji.mohammed.backend.enums.UserRole;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.UuidGenerator;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Data @AllArgsConstructor @NoArgsConstructor @SuperBuilder
public class AppUser {
    @Id
    @UuidGenerator(style = UuidGenerator.Style.TIME)
    private String id;
    private String name;
    private String username;
    private String email;
    private String password;
    private UserRole userRole;
}
