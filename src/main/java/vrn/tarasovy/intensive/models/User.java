package vrn.tarasovy.intensive.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.DynamicInsert;
import vrn.tarasovy.intensive.enums.Role;

import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Enumerated;
import javax.persistence.EnumType;



@Getter
@Setter
@Entity
@DynamicInsert
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
