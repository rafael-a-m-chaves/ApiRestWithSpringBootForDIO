package com.dio.projetoSpring.service;

import com.dio.projetoSpring.model.Calendario;
import com.dio.projetoSpring.repository.CalendarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CalendarioService {
    CalendarioRepository calendarioRepository;
    @Autowired
    public CalendarioService(CalendarioRepository calendarioRepository) {
        this.calendarioRepository = calendarioRepository;
    }

    //For Method Post
    public Calendario saveMov(Calendario calendario){
        return calendarioRepository.save(calendario);
    }

    //For Method Get All
    public List<Calendario> findall(){
        return calendarioRepository.findAll();
    }

    //For Method specific find id
    public Optional<Calendario> findid(Long id){
        return calendarioRepository.findById(id);
    }

    //For Method Put (update) specific id
    public Calendario update(Calendario calendario){
        return calendarioRepository.save(calendario);
    }

    //For Delete specific drop reg in DB
    public void delete(Long id){
        try {
            calendarioRepository.deleteById(id);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
