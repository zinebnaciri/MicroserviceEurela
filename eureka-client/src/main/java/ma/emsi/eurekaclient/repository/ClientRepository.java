package ma.emsi.eurekaclient.repository;

import ma.emsi.eurekaclient.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
