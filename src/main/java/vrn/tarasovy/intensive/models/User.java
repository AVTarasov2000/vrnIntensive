package vrn.tarasovy.intensive.models;

import com.vladmihalcea.hibernate.type.basic.PostgreSQLEnumType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import vrn.tarasovy.intensive.enums.Role;

import javax.persistence.*;


@Getter
@Setter
@Entity
@DynamicInsert
@Table(name = "\"user\"")
@NoArgsConstructor
@AllArgsConstructor
@TypeDef(name = "role", typeClass = PostgreSQLEnumType.class)
public class User extends Identity{
    @Column
    private String login;
    @Column
    private String password;
    @Column
    @Enumerated(EnumType.STRING)
    @Type(type = "role")
    private Role role;
}
