package com.dio.projetoSpring.controller;


import com.dio.projetoSpring.model.Calendario;
import com.dio.projetoSpring.service.CalendarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/calendario")
public class CalendarioController {

    CalendarioService calendarioService;
    @Autowired
    public CalendarioController(CalendarioService calendarioService) {
        this.calendarioService = calendarioService;
    }

    @PostMapping
    public Calendario save(@RequestBody Calendario calendario){
        return calendarioService.saveMov(calendario);
    }

    @GetMapping("/all")
    public List<Calendario> findAll(){
        return calendarioService.findall();
    }

    @GetMapping
    public Optional<Calendario> findid(@RequestParam Long idFind){
        return calendarioService.findid(idFind);
    }

    @PutMapping
    public Calendario update(@RequestBody Calendario calendario){
        return calendarioService.update(calendario);
    }

    @DeleteMapping
    public void deleteNivel(@RequestParam Long idDelete){
        calendarioService.delete(idDelete);
    }
}
