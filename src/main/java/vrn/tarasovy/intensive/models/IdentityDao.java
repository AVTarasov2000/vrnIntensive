package vrn.tarasovy.intensive.models;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.UUID;

public abstract class IdentityDao implements Serializable{
    @Id
    @GeneratedValue
    protected UUID id;

    public boolean isNew(){
        return id == null;
    }


}
