package com.dio.projetoSpring.controller;


import com.dio.projetoSpring.model.Movimentacao;
import com.dio.projetoSpring.service.MovimentacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/movimentacao")
public class MovimentacaoController {

    MovimentacaoService movimentacaoService;
    @Autowired
    public MovimentacaoController(MovimentacaoService movimentacaoService) {
        this.movimentacaoService = movimentacaoService;
    }

    @PostMapping
    public Movimentacao save(@RequestBody Movimentacao movimentacao){
        return movimentacaoService.saveMov(movimentacao);
    }

    @GetMapping("/all")
    public List<Movimentacao> findAll(){
        return movimentacaoService.findall();
    }

    @GetMapping
    public Optional<Movimentacao> findid(@RequestParam Long idFind){
        return movimentacaoService.findid(idFind);
    }

    @PutMapping
    public Movimentacao update(@RequestBody Movimentacao movimentacao){
        return movimentacaoService.update(movimentacao);
    }

    @DeleteMapping
    public void deleteNivel(@RequestParam Long idDelete){
        movimentacaoService.delete(idDelete);
    }
}
