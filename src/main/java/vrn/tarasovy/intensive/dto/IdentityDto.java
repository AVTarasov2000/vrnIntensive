package vrn.tarasovy.intensive.dto;

import java.io.Serializable;
import java.util.UUID;
import org.springframework.data.domain.Persistable;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public abstract class IdentityDto implements Persistable<UUID>, Serializable {
    @Id
    @GeneratedValue
    protected UUID id;

    @Override
    public boolean isNew() {
        return id == null;
    }
}
