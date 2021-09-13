package vrn.tarasovy.intensive.models;

import lombok.*;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.*;

@Getter
@Setter
@Entity
@DynamicInsert
@Table(name = "payment")
@NoArgsConstructor
@AllArgsConstructor
public class Payment extends Auditable{

    @Column(name = "type")
    private String type;
    @Column(name = "capacity")
    private Integer capacity;
}
