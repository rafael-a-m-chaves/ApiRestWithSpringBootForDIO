package com.dio.projetoSpring.controller;

import com.dio.projetoSpring.model.Ocorrencia;
import com.dio.projetoSpring.service.OcorrenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
