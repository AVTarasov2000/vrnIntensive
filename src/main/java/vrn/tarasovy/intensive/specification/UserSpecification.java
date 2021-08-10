package vrn.tarasovy.intensive.specification;

import lombok.experimental.UtilityClass;
import vrn.tarasovy.intensive.models.User;
import org.springframework.data.jpa.domain.Specification;


@UtilityClass
public class UserSpecification {

    public static Specification<User> getEmptySpec() {
        return (root, query, cb) -> cb.and();
    }
}
