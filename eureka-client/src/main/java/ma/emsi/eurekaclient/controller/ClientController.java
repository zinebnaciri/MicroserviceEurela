package ma.emsi.eurekaclient.controller;

import ma.emsi.eurekaclient.entities.Client;
import ma.emsi.eurekaclient.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("clients/")
public class ClientController {
    @Autowired
    private ClientRepository repository;

    @GetMapping("")
    public List<Client> findAll() {
        return repository.findAll();
    }

    @PostMapping("")
    public Client save(@RequestBody Client entity) {
        return repository.save(entity);
    }

    @GetMapping("id/{id}")
    public Client findById(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }

    @DeleteMapping("id/{id}")
    public void deleteById(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
