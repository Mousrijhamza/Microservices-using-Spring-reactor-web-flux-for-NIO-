package org.sid.web;


import org.sid.dao.SocieteRepository;
import org.sid.entities.Societe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class SocieteReactiveRestController {
    @Autowired
    private SocieteRepository societeRepository;

    @GetMapping(value = "/societe")
    public Flux<Societe> findAll(){
        return societeRepository.findAll();
    }//Flux<Societe>

    @GetMapping(value = "/societe/{id}")
    public Mono<Societe> getOne(@PathVariable String id){
        return societeRepository.findById(id);
    }

    @PostMapping("/societe")
    public Mono<Societe> save(@RequestBody Societe societe){
        return societeRepository.save(societe);
    }

    @DeleteMapping("/societe/{id}")
    public Mono<Void> delete(@PathVariable String id){
        return societeRepository.deleteById(id);
    }

    @PutMapping("/societe/{id}")
    public Mono<Societe> update(@PathVariable String id, @RequestBody Societe societe){
        societe.setNom(id);
        return societeRepository.save(societe);
    }

}
