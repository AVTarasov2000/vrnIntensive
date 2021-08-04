package vrn.tarasovy.intensive.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.DynamicInsert;
import vrn.tarasovy.intensive.enums.Role;

import javax.persistence.*;
import java.util.UUID;


@Getter
@Setter
@Entity
@DynamicInsert
@MappedSuperclass
@Table(name = "user")
@NoArgsConstructor
@AllArgsConstructor
public class User extends IdentityDao{

    @Column
    String login;
    @Column
    String password;
    @Column
    @Enumerated(EnumType.STRING)
    Role role;
}
