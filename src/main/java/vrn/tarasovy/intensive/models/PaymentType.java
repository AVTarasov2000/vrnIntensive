package vrn.tarasovy.intensive.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@DynamicInsert
@Table(name = "payment")
@NoArgsConstructor
@AllArgsConstructor
public class PaymentType extends Identity{
    @Column(name = "description")
    String description;
}
