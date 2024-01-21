package ma.emsi.voitureeureka.service;

import ma.emsi.voitureeureka.beans.Voiture;
import ma.emsi.voitureeureka.repository.VoitureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VoitureService {

    @Autowired
    private VoitureRepository voitureRepository;

    public Voiture enregistrerVoiture(Voiture voiture) {
        return voitureRepository.save(voiture);
    }
}
