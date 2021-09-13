package vrn.tarasovy.intensive.repository;

import org.springframework.data.repository.CrudRepository;
import vrn.tarasovy.intensive.models.place.Place;

import java.util.List;
import java.util.UUID;

public interface PlaceRepository extends CrudRepository <Place, UUID> {
    List <Place> findAll();
}
