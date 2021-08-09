package vrn.tarasovy.intensive.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vrn.tarasovy.intensive.dto.UserDetailsImpl;
import vrn.tarasovy.intensive.models.User;
import vrn.tarasovy.intensive.repository.UserRepository;

@Service
public class IntensiveUserDetailService implements UserDetailsService {
    @Autowired
    private UserRepository repository;

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        User user = repository.findByLogin(login).orElseThrow(() -> new UsernameNotFoundException("User Not Found with username: " + login));
        return UserDetailsImpl.build(user);
    }
}
