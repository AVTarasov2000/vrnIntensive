package vrn.tarasovy.intensive.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import vrn.tarasovy.intensive.models.Payment;

import java.util.UUID;

@Repository
public interface PaymentRepository extends CrudRepository<Payment, UUID> {
}
