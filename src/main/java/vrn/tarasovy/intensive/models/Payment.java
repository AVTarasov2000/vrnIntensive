package vrn.tarasovy.intensive.models;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @Column
    Integer paymentValueId;
    @Column
    Integer participantId;
    @Column
    Integer userId;
}
