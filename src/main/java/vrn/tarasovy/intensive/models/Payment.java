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
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "paymentValueId",insertable = false, updatable = false)
    private PaymentValue paymentValue;
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "userId", updatable = false)
    private User user;
}
