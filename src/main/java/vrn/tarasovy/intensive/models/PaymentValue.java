package vrn.tarasovy.intensive.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.util.UUID;

@Data
@Entity
@Table(name = "payment_value")
@NoArgsConstructor
@AllArgsConstructor
public class PaymentValue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    UUID id;
    @Column
    Date paymentDate;
    @Column
    Integer capacity;
}
