package vrn.tarasovy.intensive.dto;

import lombok.*;
import vrn.tarasovy.intensive.enums.Role;

import javax.persistence.MappedSuperclass;
import java.util.UUID;

@Getter
@Setter
@MappedSuperclass
@AllArgsConstructor
@NoArgsConstructor
public class UserDto extends IdentityDto{

    String login;
    String password;
    Role role;

    @Override
    public UUID getId() {
        return id;
    }
}
