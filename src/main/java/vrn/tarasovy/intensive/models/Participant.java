package vrn.tarasovy.intensive.models;

import com.vladmihalcea.hibernate.type.basic.PostgreSQLEnumType;
import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import vrn.tarasovy.intensive.enums.Gender;
import vrn.tarasovy.intensive.enums.Status;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@DynamicInsert
@MappedSuperclass
@Table(name = "participant")
@NoArgsConstructor
@AllArgsConstructor
@TypeDef(name = "status", typeClass = PostgreSQLEnumType.class)
public class Participant extends Identity{
    @Column
    private String name;
    @Column
    private String surname;
    @Column
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @Column
    private String phoneNumber;
    @Column
    @Enumerated(EnumType.STRING)
    @Type(type = "status")
    private Status status;
    @Column
    private Integer intensiveExperience;
    @Column
    private Integer voronezhIntensiveExperience;
    @Column
    private String tShirtSize;
    @OneToMany
    @JoinColumn(name = "participant_id")
    private List <Payment> payments;

}
