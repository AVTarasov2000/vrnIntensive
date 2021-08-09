package vrn.tarasovy.intensive.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import vrn.tarasovy.intensive.repository.UserRepository;

@Configuration
public class TestConf {

    @Autowired
    private UserRepository repository;

    @Bean
    public void test(){
        repository.findByLogin("test");
    }
}
