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
public class Participant {
    @Id
    @GeneratedValue
    private UUID id;
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
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "firstPayment", updatable = false)
    private Payment firstPayment;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "secondPayment", updatable = false)
    private Payment secondPayment;

}
