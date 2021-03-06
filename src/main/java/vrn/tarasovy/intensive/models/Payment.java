package vrn.tarasovy.intensive.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
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

    @ManyToOne
    @JoinColumn(name = "type_id")
    private Payment type;
    @Column(name = "capacity")
    private Integer capacity;
}
