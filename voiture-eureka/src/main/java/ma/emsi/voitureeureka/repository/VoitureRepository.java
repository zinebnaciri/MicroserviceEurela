package ma.emsi.voitureeureka.repository;

import ma.emsi.voitureeureka.beans.Voiture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface VoitureRepository extends JpaRepository<Voiture, Long> {

    @GetMapping("/car/{id}")
    Voiture getVoitureById(@PathVariable Long id);

    @Query("SELECT v.matricule FROM Voiture v WHERE v.id_client = :clientId")
    String getVoitureByIdClient(@PathVariable Long clientId);

    @GetMapping("/carr/{id}")
    Voiture getVoitureeById(@PathVariable Long id);

}
