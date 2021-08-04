package vrn.tarasovy.intensive.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import vrn.tarasovy.intensive.dto.UserDto;
import vrn.tarasovy.intensive.mappers.config.IgnoreUnmappedMapperConfig;
import vrn.tarasovy.intensive.models.User;

@Mapper(config = IgnoreUnmappedMapperConfig.class,
        uses = {})
public interface UserMapper extends AbstractMapper<UserDto, User> {
    User toDao(UserDto dto);
    UserDto toDto(User dao);
}