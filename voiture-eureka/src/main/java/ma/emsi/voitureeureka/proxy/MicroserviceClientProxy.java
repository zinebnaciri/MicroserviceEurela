package ma.emsi.voitureeureka.proxy;

import ma.emsi.voitureeureka.utils.ClientVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "SERVICE-CLIENT", url = "http://localhost:8088")

public interface MicroserviceClientProxy {
    @GetMapping("/clients/")
    List<ClientVo> find();

    @GetMapping("/clients/{id}")
    ClientVo chercherUnClient(@PathVariable Long id);

    @GetMapping("clientInfo/{id}")
    ClientVo getInfoClient(@PathVariable Long id);

}
