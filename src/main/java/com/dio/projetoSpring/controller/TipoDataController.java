package com.dio.projetoSpring.controller;
import com.dio.projetoSpring.model.TipoData;
import com.dio.projetoSpring.service.TipoDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

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

    @GetMapping("/all")
    public List <TipoData> getTipoDataList(){return tipoDataService.findall();}

    @GetMapping
    public Optional<TipoData> getTipoDataById(@RequestParam Long idTipoData)
    {
        return tipoDataService.getById(idTipoData);
    }

    @PutMapping
    public TipoData update(@RequestBody TipoData tipoData){
        return tipoDataService.update(tipoData);
    }
}
