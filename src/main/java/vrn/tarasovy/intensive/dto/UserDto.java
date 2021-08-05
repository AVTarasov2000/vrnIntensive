package vrn.tarasovy.intensive.dto;

import lombok.*;
import vrn.tarasovy.intensive.enums.Role;

import java.util.UUID;

@Getter
@Setter
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
