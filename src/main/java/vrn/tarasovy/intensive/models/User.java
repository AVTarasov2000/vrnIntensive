package vrn.tarasovy.intensive.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import vrn.tarasovy.intensive.enums.Role;

import javax.persistence.*;
import java.util.UUID;

@Data
@Entity
@Table(name = "user")
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    UUID id;
    @Column
    String login;
    @Column
    String password;
    @Column
    @Enumerated(EnumType.STRING)
    Role role;
}
