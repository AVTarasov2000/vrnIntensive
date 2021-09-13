package vrn.tarasovy.intensive.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import vrn.tarasovy.intensive.models.place.Place;

import java.util.List;
import java.util.UUID;

@Repository
public interface PlaceRepository extends CrudRepository <Place, UUID> {
    List <Place> findAll();
}
