package com.dio.projetoSpring.controller;

import com.dio.projetoSpring.model.Localidade;
import com.dio.projetoSpring.service.LocalidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/localidade")
public class LocalidadeController {

    LocalidadeService localidadeService;
    @Autowired
    public LocalidadeController(LocalidadeService localidadeService) {
        this.localidadeService = localidadeService;
    }
    @PostMapping
    public Localidade save(@RequestBody Localidade localidade){
        return localidadeService.saveMov(localidade);
    }

    @GetMapping("/all")
    public List<Localidade> findAll(){
        return localidadeService.findall();
    }

    @GetMapping
    public Optional<Localidade> findid(@RequestParam Long idFind){
        return localidadeService.findid(idFind);
    }

    @PutMapping
    public Localidade update(@RequestBody Localidade localidade){
        return localidadeService.update(localidade);
    }

    @DeleteMapping
    public void deleteNivel(@RequestParam Long idDelete){
        localidadeService.delete(idDelete);
    }

}
