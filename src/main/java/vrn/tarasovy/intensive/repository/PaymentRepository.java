package vrn.tarasovy.intensive.repository;

import org.springframework.data.repository.CrudRepository;
import vrn.tarasovy.intensive.models.Payment;

import java.util.UUID;

public interface PaymentRepository extends CrudRepository<Payment, UUID> {
}
