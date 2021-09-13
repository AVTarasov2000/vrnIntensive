package vrn.tarasovy.intensive.specification;

import org.springframework.data.jpa.domain.Specification;
import vrn.tarasovy.intensive.models.Participant;

import javax.persistence.criteria.Join;

public class ParticipantSpecification {

    public static Specification<Participant> getEmptySpec() {
        return (root, query, cb) -> cb.and();
    }

    public static Specification<Participant> getParticipantWithoutFirstPayment() {
        return (root, query, cb) -> cb.equal(root.get("id"), null);
    }

}
