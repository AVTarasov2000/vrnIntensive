package vrn.tarasovy.intensive.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import vrn.tarasovy.intensive.models.Participant;
import vrn.tarasovy.intensive.repository.ParticipantRepository;
import vrn.tarasovy.intensive.specification.ParticipantSpecification;

import java.util.List;

public class ParticipantService {

    @Autowired
    private ParticipantRepository participantRepository;

    public List<Participant> getParticipants(){
        Specification<Participant> spec = ParticipantSpecification.getEmptySpec();
        spec = spec.and(ParticipantSpecification.getParticipantWithoutFirstPayment());
        return participantRepository.findAll(spec);
    }
}
