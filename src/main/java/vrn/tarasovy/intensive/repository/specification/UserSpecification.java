package vrn.tarasovy.intensive.repository.specification;

import lombok.experimental.UtilityClass;
import vrn.tarasovy.intensive.models.User;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.Join;
import java.time.LocalDate;
import java.util.UUID;


@UtilityClass
public class UserSpecification {

    public static Specification<User> getEmptySpec() {
        return (root, query, cb) -> cb.and();
    }
}
