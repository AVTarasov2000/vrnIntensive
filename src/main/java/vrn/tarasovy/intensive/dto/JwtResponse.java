package vrn.tarasovy.intensive.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JwtResponse {

    private String jwt;
    private UUID uuid;
    private String login;
    private List <String> roles;
}
