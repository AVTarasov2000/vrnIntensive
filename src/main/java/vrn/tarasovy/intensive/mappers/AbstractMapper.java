package vrn.tarasovy.intensive.mappers;

import vrn.tarasovy.intensive.dto.IdentityDto;
import vrn.tarasovy.intensive.models.IdentityDao;

public interface AbstractMapper<T extends IdentityDto, D extends IdentityDao> {

    D toDao(T dto);
    T toDto(D dao);
}
