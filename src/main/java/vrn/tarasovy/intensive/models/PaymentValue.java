package vrn.tarasovy.intensive.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Data
@Entity
@Table(name = "?", schema = "?")
@NoArgsConstructor
@AllArgsConstructor
public class PaymentValue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @Column
    Date paymentDate;
    @Column
    Integer capacity;
}
