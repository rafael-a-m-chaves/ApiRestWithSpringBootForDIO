package com.dio.projetoSpring.service;

import com.dio.projetoSpring.model.CategoriaUsuario;
import com.dio.projetoSpring.repository.CategoriaUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
public class CategoriaUsuarioService {

    CategoriaUsuarioRepository categoriaUsuarioRepository;
    @Autowired
    public CategoriaUsuarioService(CategoriaUsuarioRepository categoriaUsuarioRepository) {
        this.categoriaUsuarioRepository = categoriaUsuarioRepository;
    }

    //For Method Post
    public CategoriaUsuario saveMov(CategoriaUsuario categoriaUsuario){
        return categoriaUsuarioRepository.save(categoriaUsuario);
    }

    //For Method Get All
    public List<CategoriaUsuario> findall(){
        return categoriaUsuarioRepository.findAll();
    }

    //For Method specific find id
    public Optional<CategoriaUsuario> findid(Long id){
        return categoriaUsuarioRepository.findById(id);
    }

    //For Method Put (update) specific id
    public CategoriaUsuario update(CategoriaUsuario categoriaUsuario){
        return categoriaUsuarioRepository.save(categoriaUsuario);
    }

    //For Delete specific drop reg in DB
    public void delete(Long id){
        try {
            categoriaUsuarioRepository.deleteById(id);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
