package vrn.tarasovy.intensive.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vrn.tarasovy.intensive.dto.UserDto;
import vrn.tarasovy.intensive.models.User;
import vrn.tarasovy.intensive.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Transactional
    public void addUser(UserDto userDto){
        User user =  new User(userDto.getLogin(), userDto.getPassword(), userDto.getRole());
        userRepository.save(user);
    }
}
