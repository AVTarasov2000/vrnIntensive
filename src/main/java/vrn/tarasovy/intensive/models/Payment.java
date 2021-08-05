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
public class Payment extends IdentityDao{

    @Column
    UUID paymentValueId;
    @Column
    UUID userId;
    @OneToOne
    PaymentValue paymentValue;
    @OneToOne
    User user;
}
