package com.dio.projetoSpring.controller;

import com.dio.projetoSpring.model.BancoHoras;
import com.dio.projetoSpring.model.Calendario;
import com.dio.projetoSpring.service.BancoHorasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/bancohoras")
public class BancoHorasController {
    BancoHorasService bancoHorasService;
    @Autowired
    public BancoHorasController(BancoHorasService bancoHorasService) {
        this.bancoHorasService = bancoHorasService;
    }
    @PostMapping
    public BancoHoras save(@RequestBody BancoHoras bancoHoras){
        return bancoHorasService.saveMov(bancoHoras);
    }

    @GetMapping("/all")
    public List<BancoHoras> findAll(){
        return bancoHorasService.findall();
    }

    @GetMapping
    public Optional<BancoHoras> findid(@RequestParam Long idFind){
        return bancoHorasService.findid(idFind);
    }

    @PutMapping
    public BancoHoras update(@RequestBody BancoHoras bancoHoras){
        return bancoHorasService.update(bancoHoras);
    }

    @DeleteMapping
    public void deleteNivel(@RequestParam Long idDelete){
        bancoHorasService.delete(idDelete);
    }
}
