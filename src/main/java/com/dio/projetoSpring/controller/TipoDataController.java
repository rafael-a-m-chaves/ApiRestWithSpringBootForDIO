package com.dio.projetoSpring.controller;

import com.dio.projetoSpring.model.TipoData;
import com.dio.projetoSpring.service.TipoDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tipoData")
public class TipoDataController {

    TipoDataService tipoDataService;
    @Autowired //Constructor
    public TipoDataController(TipoDataService tipoDataService)
    {
        this.tipoDataService = tipoDataService;
    }


    @PostMapping
    public TipoData save(@RequestBody TipoData tipoData){
        return tipoDataService.save(tipoData);
    }
}
