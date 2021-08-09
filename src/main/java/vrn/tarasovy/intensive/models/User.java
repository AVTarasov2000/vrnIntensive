package vrn.tarasovy.intensive.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import vrn.tarasovy.intensive.enums.Role;
import vrn.tarasovy.intensive.models.types.RolePostgreSQLEnumType;

import javax.persistence.*;
import java.util.UUID;


@Getter
@Setter
@Entity
@DynamicInsert
@Table(name = "\"user\"")
@NoArgsConstructor
@AllArgsConstructor
@TypeDef(name = "role", typeClass = RolePostgreSQLEnumType.class)
public class User {

    @Id
    @GeneratedValue
    private UUID id;
    @Column
    private String login;
    @Column
    private String password;
    @Column
    @Enumerated(EnumType.STRING)
    private Role role;
}
