package vrn.tarasovy.intensive.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import vrn.tarasovy.intensive.enums.Gender;
import vrn.tarasovy.intensive.enums.Status;

import javax.persistence.*;

@Data
@Entity
@Table(name = "?", schema = "?")
@NoArgsConstructor
@AllArgsConstructor
public class Participant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
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

}
