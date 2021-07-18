package com.dio.projetoSpring.service;

import com.dio.projetoSpring.model.NivelAcesso;
import com.dio.projetoSpring.repository.NivelAcessoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NivelAcessoService {
    NivelAcessoRepository nivelAcessoRepository;
    @Autowired //Constructor
    public NivelAcessoService(NivelAcessoRepository nivelAcessoRepository) {
        this.nivelAcessoRepository = nivelAcessoRepository;
    }
    //For Method Post
    public NivelAcesso save(NivelAcesso nivelAcesso){
        return nivelAcessoRepository.save(nivelAcesso);
    }

    //For Method Get All
    public List <NivelAcesso> findall(){
        return nivelAcessoRepository.findAll();
    }

    //For Method specific find id
    public Optional<NivelAcesso> findid(Long id){
        return nivelAcessoRepository.findById(id);
    }

    //For Method Put (update) specific id
    public NivelAcesso update(NivelAcesso nivelAcesso){
        return nivelAcessoRepository.save(nivelAcesso);
    }

    //For Delete specific drop reg in DB
    public void delete(Long id){
        try {
            nivelAcessoRepository.deleteById(id);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
