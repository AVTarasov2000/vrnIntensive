package vrn.tarasovy.intensive.models.place;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import vrn.tarasovy.intensive.models.Identity;

import javax.persistence.*;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "place")
public class Place extends Identity {

    @Column(name = "price")
    Integer price;

    @Column(name = "number")
    String number;

    @Column(name = "description")
    String description;

    @ManyToOne
    @JoinColumn(name = "type_id")
    private PlaceType type;

    @OneToMany
    @JoinColumn(name = "parent_id")
    List <Place> children;
}
