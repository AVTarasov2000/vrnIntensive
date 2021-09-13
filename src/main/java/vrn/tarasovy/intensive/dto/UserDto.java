package vrn.tarasovy.intensive.dto;

import lombok.*;
import org.springframework.data.domain.Persistable;
import vrn.tarasovy.intensive.enums.Role;

import java.io.Serializable;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDto extends IdentityDto implements Persistable <UUID>, Serializable{

    private static final long serialVersionUID = -652610286635305248L;
    private String login;
    private String password;
    private Role role;

    @Override
    public boolean isNew() {
        return getId()==null;
    }
}
