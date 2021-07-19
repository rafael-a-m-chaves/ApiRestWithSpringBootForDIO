package com.dio.projetoSpring.service;


import com.dio.projetoSpring.model.Empresa;
import com.dio.projetoSpring.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class EmpresaService {

    EmpresaRepository empresaRepository;
    @Autowired
    public EmpresaService(EmpresaRepository empresaRepository) {
        this.empresaRepository = empresaRepository;
    }

    //For Method Post
    public Empresa saveMov(Empresa empresa){
        return empresaRepository.save(empresa);
    }

    //For Method Get All
    public List<Empresa> findall(){
        return empresaRepository.findAll();
    }

    //For Method specific find id
    public Optional<Empresa> findid(Long id){
        return empresaRepository.findById(id);
    }

    //For Method Put (update) specific id
    public Empresa update(Empresa empresa){
        return empresaRepository.save(empresa);
    }

    //For Delete specific drop reg in DB
    public void delete(Long id){
        try {
            empresaRepository.deleteById(id);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
