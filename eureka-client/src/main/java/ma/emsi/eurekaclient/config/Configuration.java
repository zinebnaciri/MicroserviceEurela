package ma.emsi.eurekaclient.config;

import ma.emsi.eurekaclient.entities.Client;
import ma.emsi.eurekaclient.repository.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {
    @Bean
    CommandLineRunner initH2(ClientRepository clientRepository) {
        return args -> {
            clientRepository.save(new Client("Badr", 20));
            clientRepository.save(new Client("Youssef", 23));
            clientRepository.save(new Client("Ayoub", 30));
        };
    }
}
