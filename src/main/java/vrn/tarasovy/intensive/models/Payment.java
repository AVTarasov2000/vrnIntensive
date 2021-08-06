package vrn.tarasovy.intensive.models;

import lombok.*;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.*;
import java.util.UUID;

@Getter
@Setter
@Entity
@DynamicInsert
@MappedSuperclass
@Table(name = "payment")
@NoArgsConstructor
@AllArgsConstructor
public class Payment {
    @Id
    @GeneratedValue
    private UUID id;
    @Column
    private UUID paymentValueId;
    @Column
    private UUID userId;
    @OneToOne
    private PaymentValue paymentValue;
    @OneToOne
    private User user;
}
