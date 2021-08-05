package vrn.tarasovy.intensive.models;

import lombok.*;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.*;
import java.sql.Date;
import java.util.UUID;

@Getter
@Setter
@Entity
@DynamicInsert
@MappedSuperclass
@Table(name = "payment_value")
@NoArgsConstructor
@AllArgsConstructor
public class PaymentValue extends IdentityDao{

    @Column
    Date paymentDate;
    @Column
    Integer capacity;
}
