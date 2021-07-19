package com.dio.projetoSpring.controller;

import com.dio.projetoSpring.model.CategoriaUsuario;
import com.dio.projetoSpring.service.CategoriaUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/categoriaUsuario")
public class CategoriaUsuarioController {

    CategoriaUsuarioService categoriaUsuarioService;
    @Autowired
    public CategoriaUsuarioController(CategoriaUsuarioService categoriaUsuarioService) {
        this.categoriaUsuarioService = categoriaUsuarioService;
    }

    @PostMapping
    public CategoriaUsuario save(@RequestBody CategoriaUsuario categoriaUsuario){
        return categoriaUsuarioService.saveMov(categoriaUsuario);
    }

    @GetMapping("/all")
    public List<CategoriaUsuario> findAll(){
        return categoriaUsuarioService.findall();
    }

    @GetMapping
    public Optional<CategoriaUsuario> findid(@RequestParam Long idFind){
        return categoriaUsuarioService.findid(idFind);
    }

    @PutMapping
    public CategoriaUsuario update(@RequestBody CategoriaUsuario categoriaUsuario){
        return categoriaUsuarioService.update(categoriaUsuario);
    }

    @DeleteMapping
    public void deleteNivel(@RequestParam Long idDelete){
        categoriaUsuarioService.delete(idDelete);
    }
}
