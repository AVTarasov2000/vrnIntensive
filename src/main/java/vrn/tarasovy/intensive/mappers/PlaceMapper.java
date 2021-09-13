package vrn.tarasovy.intensive.mappers;

import org.mapstruct.Mapper;
import vrn.tarasovy.intensive.dto.PlaceDto;
import vrn.tarasovy.intensive.mappers.config.IgnoreUnmappedMapperConfig;
import vrn.tarasovy.intensive.models.place.Place;

@Mapper(config = IgnoreUnmappedMapperConfig.class,
        uses = {IdentityMapper.class})
public interface PlaceMapper {
    Place toDao(PlaceDto dto);
    PlaceDto toDto(Place dao);
}