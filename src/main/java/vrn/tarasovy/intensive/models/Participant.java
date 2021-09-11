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
    private Status status;
    @Column
    private Integer intensiveExperience;
    @Column
    private Integer voronezhIntensiveExperience;
    @Column
    private String tShirtSize;
    @Column
    private UUID firstPayment_;
    @Column
    private UUID secondPayment_;
    @OneToOne
    Payment firstPayment;
    @OneToOne
    private Payment secondPayment;

}
