package com.dio.projetoSpring.service;

import com.dio.projetoSpring.model.BancoHoras;
import com.dio.projetoSpring.model.Localidade;
import com.dio.projetoSpring.repository.BancoHorasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BancoHorasService {
    BancoHorasRepository bancoHorasRepository;
    @Autowired
    public BancoHorasService(BancoHorasRepository bancoHorasRepository) {
        this.bancoHorasRepository = bancoHorasRepository;
    }

    //For Method Post
    public BancoHoras saveMov(BancoHoras bancoHoras){
        return bancoHorasRepository.save(bancoHoras);
    }

    //For Method Get All
    public List<BancoHoras> findall(){
        return bancoHorasRepository.findAll();
    }

    //For Method specific find id
    public Optional<BancoHoras> findid(Long id){
        return bancoHorasRepository.findById(id);
    }

    //For Method Put (update) specific id
    public BancoHoras update(BancoHoras bancoHoras){
        return bancoHorasRepository.save(bancoHoras);
    }

    //For Delete specific drop reg in DB
    public void delete(Long id){
        try {
            bancoHorasRepository.deleteById(id);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
