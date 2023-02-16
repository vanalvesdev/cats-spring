package br.com.vaanalvesr.catsspring.resource;

import br.com.vaanalvesr.catsspring.model.BreedWrapper;
import br.com.vaanalvesr.catsspring.service.CatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CatResource {

    @Autowired
    CatService catService;

    @GetMapping("/performance")
    public String listar() {
        return catService.getFact().getFact();
    }
}
