package com.dio.projetoSpring.controller;

import com.dio.projetoSpring.model.JornadaTrabalho;
import com.dio.projetoSpring.service.JornadaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/jornada")
public class JornadaTrabalhoController {

    JornadaService jornadaService;
    @Autowired
    public JornadaTrabalhoController(JornadaService jornadaService) {
        this.jornadaService = jornadaService;
    }

    @PostMapping
    public JornadaTrabalho createJornada(@RequestBody JornadaTrabalho jornadaTrabalho){
        return jornadaService.saveJornada(jornadaTrabalho);
    }

    @GetMapping("/all")
    public List<JornadaTrabalho> getJornadaList(){
        return jornadaService.findall();
    }

    @GetMapping
    public Optional<JornadaTrabalho> getJornadaById(@RequestParam Long idJornada) throws Exception {
        return jornadaService.getById(idJornada);
    }

    @PutMapping
    public JornadaTrabalho updateJornadaid(@RequestBody JornadaTrabalho jornadaTrabalho){
        return jornadaService.updateJornada(jornadaTrabalho);
    }

    @DeleteMapping
    public void deleteJornada(@RequestParam Long idJornadaDel) {
        jornadaService.deleteJornada(idJornadaDel);
    }


}
