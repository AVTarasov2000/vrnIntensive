package vrn.tarasovy.intensive.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import vrn.tarasovy.intensive.models.User;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRepository extends CrudRepository<User, UUID> {
    Optional<User> findByLogin(String login);
    Boolean existsByLogin(String login);

}
/*
@Repository
public interface WelderRepository extends PagingAndSortingRepository<Welder, UUID>, JpaSpecificationExecutor<Welder> {

    Optional<Welder> findByBrand(String brand);

    @Query(nativeQuery = true , value = "SELECT distinct ww.*, w.* " +
            "FROM {h-schema}admission_welder_welding_type awwt \n" +
            "INNER JOIN {h-schema}admission_welder aw ON awwt.admission_id = aw.id \n" +
            "INNER JOIN {h-schema}worker_welder ww ON aw.welder_id = ww.id \n"  +
            "INNER JOIN {h-schema}worker w ON w.id = ww.id AND w.legal_entity_id=:legalEntityId \n " +
            "INNER JOIN {h-schema}dictionary_value dv ON w.status = dv.id AND dv.CODE='WORKING' \n " +
            "INNER JOIN {h-schema}naks_welder nw ON nw.welder_id = ww.id and nw.welding_type=:weldingTypeId \n" +
            "INNER JOIN {h-schema}naks n ON nw.id = n.id and n.certification_date_to > now() \n" +
            "WHERE awwt.welding_type_id=:weldingTypeId")
    List<Welder> findListWelderForJoints(@Param("legalEntityId") UUID legalEntityId, @Param("weldingTypeId") UUID weldingTypeId);

    List<Welder> findAllByIdIn(List<UUID> ids);

    @Query("select distinct layer.welder from ControlWeldedJointContent cwj join ControlWeldedJointLayer layer on layer.content = cwj")
    List<Welder> getAllFromCwjContent();

}


@NoRepositoryBean
public interface AbstractFileRepository<D extends FileContainer>  extends CrudRepository<D, FilePK> {
    List<D> findByKeyEntityId(UUID entityId);
}
* */