package com.dio.projetoSpring.service;


import com.dio.projetoSpring.model.Localidade;
import com.dio.projetoSpring.repository.LocalidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class LocalidadeService {
    LocalidadeRepository localidadeRepository;
    @Autowired
    public LocalidadeService(LocalidadeRepository localidadeRepository) {
        this.localidadeRepository = localidadeRepository;
    }

    //For Method Post
    public Localidade saveMov(Localidade localidade){
        return localidadeRepository.save(localidade);
    }

    //For Method Get All
    public List<Localidade> findall(){
        return localidadeRepository.findAll();
    }

    //For Method specific find id
    public Optional<Localidade> findid(Long id){
        return localidadeRepository.findById(id);
    }

    //For Method Put (update) specific id
    public Localidade update(Localidade localidade){
        return localidadeRepository.save(localidade);
    }

    //For Delete specific drop reg in DB
    public void delete(Long id){
        try {
            localidadeRepository.deleteById(id);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
