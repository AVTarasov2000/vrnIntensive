package vrn.tarasovy.intensive.mappers;

import org.mapstruct.Mapper;
import vrn.tarasovy.intensive.mappers.config.IgnoreUnmappedMapperConfig;

@Mapper(config = IgnoreUnmappedMapperConfig.class,
        uses = {})
public interface IdentityMapper {
}
