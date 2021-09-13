package vrn.tarasovy.intensive.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import vrn.tarasovy.intensive.models.place.Place;
import vrn.tarasovy.intensive.models.place.PlaceType;
import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlaceDto extends IdentityDto{
    private Integer price;
    private String number;
    private String description;
    private PlaceType type;
    private List <Place> children;
}
