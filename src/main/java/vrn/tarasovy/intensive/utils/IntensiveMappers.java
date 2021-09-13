package vrn.tarasovy.intensive.utils;

import lombok.experimental.UtilityClass;
import vrn.tarasovy.intensive.mappers.PlaceMapper;
import vrn.tarasovy.intensive.mappers.UserMapper;
import org.mapstruct.factory.Mappers;

@UtilityClass
public class IntensiveMappers {
    public static final UserMapper USER_MAPPER = Mappers.getMapper(UserMapper.class);
    public static final PlaceMapper PLACE_MAPPER = Mappers.getMapper(PlaceMapper.class);
}
