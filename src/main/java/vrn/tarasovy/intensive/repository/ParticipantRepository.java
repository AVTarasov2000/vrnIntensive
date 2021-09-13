package vrn.tarasovy.intensive.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import vrn.tarasovy.intensive.models.Participant;

import java.util.List;
import java.util.UUID;

@Repository
public interface ParticipantRepository extends CrudRepository<Participant, UUID>, JpaSpecificationExecutor<Participant> {

}
