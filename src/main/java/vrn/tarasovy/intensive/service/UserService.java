package vrn.tarasovy.intensive.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vrn.tarasovy.intensive.dto.UserDto;
import vrn.tarasovy.intensive.models.User;
import vrn.tarasovy.intensive.repository.UserRepository;

import java.util.UUID;

import static vrn.tarasovy.intensive.utils.IntensiveMappers.USER_MAPPER;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Transactional
    public UserDto save(UserDto userDto){
        User user = USER_MAPPER.toDao(userDto);
        return USER_MAPPER.toDto(userRepository.save(user));
    }

    @Transactional
    public UserDto getById(UUID id) {
        return USER_MAPPER.toDto(userRepository.findById(id).orElse(null));
    }

    @Transactional
    public boolean existsByLogin(String login) {
        return userRepository.existsByLogin(login);
    }

    public UserDto findByLogin(String login){
        return USER_MAPPER.toDto(userRepository.findByLogin(login).orElseThrow(()->new UsernameNotFoundException("")));
    }

}
