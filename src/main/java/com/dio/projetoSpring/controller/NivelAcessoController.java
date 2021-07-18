package com.dio.projetoSpring.controller;

import com.dio.projetoSpring.model.NivelAcesso;
import com.dio.projetoSpring.service.NivelAcessoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/nivelacesso")
public class NivelAcessoController {
    NivelAcessoService nivelAcessoService;
    @Autowired
    public NivelAcessoController(NivelAcessoService nivelAcessoService) {
        this.nivelAcessoService = nivelAcessoService;
    }

    @PostMapping
    public NivelAcesso save(@RequestBody NivelAcesso nivelAcesso){
        return nivelAcessoService.save(nivelAcesso);
    }

    @GetMapping("/all")
    public List <NivelAcesso> findAll(){
        return nivelAcessoService.findall();
    }

    @GetMapping
    public Optional <NivelAcesso> findid(@RequestParam Long idFind){
        return nivelAcessoService.findid(idFind);
    }

    @PutMapping
    public NivelAcesso update(@RequestBody NivelAcesso nivelAcesso){
        return nivelAcessoService.update(nivelAcesso);
    }

    @DeleteMapping
    public void deleteNivel(@RequestParam Long idDelete){
        nivelAcessoService.delete(idDelete);
    }
}
