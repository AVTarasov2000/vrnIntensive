package vrn.tarasovy.intensive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "vrn.tarasovy.intensive")
@EnableJpaRepositories(basePackages = "vrn.tarasovy.intensive.repository")
@EntityScan("vrn.tarasovy.intensive.models")
public class IntensiveApplication {

    public static void main(String[] args) {
        SpringApplication.run(IntensiveApplication.class, args);
    }

}
