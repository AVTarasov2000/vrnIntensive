package vrn.tarasovy.intensive.models;

import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import vrn.tarasovy.intensive.enums.Gender;
import vrn.tarasovy.intensive.enums.Status;

import javax.persistence.*;
import java.util.UUID;

@Getter
@Setter
@Entity
@DynamicInsert
@MappedSuperclass
@Table(name = "participant")
@NoArgsConstructor
@AllArgsConstructor
public class Participant extends IdentityDao{

    @Column
    String name;
    @Column
    String surname;
    @Column
    @Enumerated(EnumType.STRING)
    Gender gender;
    @Column
    String phoneNumber;
    @Column
    @Enumerated(EnumType.STRING)
    Status status;
    @Column
    Integer intensiveExperience;
    @Column
    Integer voronezhIntensiveExperience;
    @Column
    String tShirtSize;
    @Column
    UUID firstPayment_;
    @Column
    UUID secondPayment_;
    @OneToOne
    Payment firstPayment;
    @OneToOne
    Payment secondPayment;

}
