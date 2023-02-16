package br.com.vaanalvesr.catsspring.service;


import br.com.vaanalvesr.catsspring.model.BreedWrapper;
import br.com.vaanalvesr.catsspring.model.CatFact;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "cats", url = "https://catfact.ninja/")
public interface CatService {

    @GetMapping("/breeds")
    BreedWrapper listar();

    @GetMapping("/fact")
    CatFact getFact();
}
