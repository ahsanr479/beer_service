package ahsan.micro.beer_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class BeerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BeerServiceApplication.class, args);
    }

}
