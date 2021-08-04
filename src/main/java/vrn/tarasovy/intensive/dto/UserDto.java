package vrn.tarasovy.intensive.dto;

import lombok.Data;
import vrn.tarasovy.intensive.enums.Role;

import java.util.UUID;

@Data
public class UserDto extends IdentityDto{

    String login;
    String password;
    Role role;

    @Override
    public UUID getId() {
        return id;
    }
}
