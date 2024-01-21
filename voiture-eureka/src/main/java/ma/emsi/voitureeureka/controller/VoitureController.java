package ma.emsi.voitureeureka.controller;


import ma.emsi.voitureeureka.beans.Voiture;
import ma.emsi.voitureeureka.proxy.MicroserviceClientProxy;
import ma.emsi.voitureeureka.repository.VoitureRepository;
import ma.emsi.voitureeureka.service.VoitureService;
import ma.emsi.voitureeureka.utils.ClientVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()

public class VoitureController {

    @Autowired
    VoitureRepository voitureRepository;
    @Autowired
    MicroserviceClientProxy microserviceUserProxy;
    @Autowired
    VoitureService voitureService;

    @GetMapping("/clients")
    public List<ClientVo> find() {
        return microserviceUserProxy.find();
    }

    // un client par id
    @GetMapping("/clients/{id}")
    ClientVo chercherUnClient(@PathVariable Long id) {
        return microserviceUserProxy.chercherUnClient(id);
    }

    @GetMapping("/car/{id}")
    Voiture getVoitureById(@PathVariable Long id) {
        return voitureRepository.getVoitureById(id);
    }

    @GetMapping("/carr/{id}")
    Voiture getVoitureeById(@PathVariable Long id) {
        Voiture voiture = getVoitureById(id);
        ClientVo client = getInfoClient(voiture.getId());
        voiture.setClient(client);
        return voiture;
    }


    @GetMapping("clientInfo/{id}")
    ClientVo getInfoClient(@PathVariable Long id) {
        Voiture voiture = voitureRepository.getVoitureById(id);
        return microserviceUserProxy.chercherUnClient(voiture.getId_client());
    }
}
