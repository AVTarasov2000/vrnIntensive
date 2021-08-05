package vrn.tarasovy.intensive.dto;

import java.io.Serializable;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.domain.Persistable;

import javax.persistence.GeneratedValue;

@AllArgsConstructor
@NoArgsConstructor
public abstract class IdentityDto implements Persistable<UUID>, Serializable {
    @Id
    @GeneratedValue
    protected UUID id;

    @Override
    public boolean isNew() {
        return id == null;
    }
}
