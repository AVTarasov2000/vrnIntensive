package vrn.tarasovy.intensive.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vrn.tarasovy.intensive.dto.UserDto;
import vrn.tarasovy.intensive.models.User;
import vrn.tarasovy.intensive.repository.UserRepository;

import static vrn.tarasovy.intensive.utils.IntensiveMappers.USER_MAPPER;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Transactional
    public UserDto addUser(UserDto userDto){
        User user = USER_MAPPER.toDao(userDto);
        return USER_MAPPER.toDto(userRepository.save(user));
    }
}
