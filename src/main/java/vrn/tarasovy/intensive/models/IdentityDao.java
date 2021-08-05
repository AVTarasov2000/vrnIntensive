package vrn.tarasovy.intensive.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.util.UUID;

@MappedSuperclass
@Entity
public abstract class IdentityDao implements Serializable{
    @Id
    @GeneratedValue
    protected UUID id;

    public boolean isNew(){
        return id == null;
    }
}
