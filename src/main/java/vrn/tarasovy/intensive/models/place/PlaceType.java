package vrn.tarasovy.intensive.models.place;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import vrn.tarasovy.intensive.models.Identity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "place_type")
public class PlaceType extends Identity {

    @Column(name = "description")
    String description;
}
