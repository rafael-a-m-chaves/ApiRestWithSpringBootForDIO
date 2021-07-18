package com.dio.projetoSpring.controller;

import com.dio.projetoSpring.model.Ocorrencia;
import com.dio.projetoSpring.service.OcorrenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/ocorrencia")
public class OcorrenciaController {
    OcorrenciaService ocorrenciaService;
    @Autowired
    public OcorrenciaController(OcorrenciaService ocorrenciaService) {
        this.ocorrenciaService = ocorrenciaService;
    }

    @PostMapping
    public Ocorrencia save(@RequestBody Ocorrencia ocorrencia){
        return ocorrenciaService.save(ocorrencia);
    }

    @GetMapping("/all")
    public List <Ocorrencia> findall(){
        return ocorrenciaService.findall();
    }

    @GetMapping
    public Optional <Ocorrencia> findid(@RequestParam Long idOcorrenciaFind){
        return ocorrenciaService.getById(idOcorrenciaFind);
    }

    
}
