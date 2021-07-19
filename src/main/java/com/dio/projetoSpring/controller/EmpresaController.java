package com.dio.projetoSpring.controller;

import com.dio.projetoSpring.model.Empresa;
import com.dio.projetoSpring.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/empresa")
public class EmpresaController {
    EmpresaService empresaService;
    @Autowired
    public EmpresaController(EmpresaService empresaService) {
        this.empresaService = empresaService;
    }

    @PostMapping
    public Empresa save(@RequestBody Empresa empresa){
        return empresaService.saveMov(empresa);
    }

    @GetMapping("/all")
    public List<Empresa> findAll(){
        return empresaService.findall();
    }

    @GetMapping
    public Optional<Empresa> findid(@RequestParam Long idFind){
        return empresaService.findid(idFind);
    }

    @PutMapping
    public Empresa update(@RequestBody Empresa empresa){
        return empresaService.update(empresa);
    }

    @DeleteMapping
    public void deleteNivel(@RequestParam Long idDelete){
        empresaService.delete(idDelete);
    }
}
