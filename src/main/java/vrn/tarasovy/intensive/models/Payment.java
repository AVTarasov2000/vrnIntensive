package vrn.tarasovy.intensive.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

@Data
@Entity
@Table(name = "payment")
@NoArgsConstructor
@AllArgsConstructor
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    UUID id;
    @Column
    UUID paymentValueId;
    @Column
    UUID userId;
    @OneToOne
    PaymentValue paymentValue;
    @OneToOne
    User user;
}
