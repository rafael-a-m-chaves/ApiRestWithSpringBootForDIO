package com.dio.projetoSpring.controller;

import com.dio.projetoSpring.model.NivelAcesso;
import com.dio.projetoSpring.service.NivelAcessoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    
}
