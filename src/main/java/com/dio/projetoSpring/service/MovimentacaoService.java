package com.dio.projetoSpring.service;

import com.dio.projetoSpring.model.Movimentacao;
import com.dio.projetoSpring.repository.MovimentacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
public class MovimentacaoService {

    MovimentacaoRepository movimentacaoRepository;
    @Autowired
    public MovimentacaoService(MovimentacaoRepository movimentacaoRepository) {
        this.movimentacaoRepository = movimentacaoRepository;
    }

    //For Method Post
    public Movimentacao saveMov(Movimentacao movimentacao){
        return movimentacaoRepository.save(movimentacao);
    }

    //For Method Get All
    public List<Movimentacao> findall(){
        return movimentacaoRepository.findAll();
    }

    //For Method specific find id
    public Optional<Movimentacao> findid(Long id){
        return movimentacaoRepository.findById(id);
    }

    //For Method Put (update) specific id
    public Movimentacao update(Movimentacao movimentacao){
        return movimentacaoRepository.save(movimentacao);
    }

    //For Delete specific drop reg in DB
    public void delete(Long id){
        try {
            movimentacaoRepository.deleteById(id);
        }catch (Exception e){
            System.out.println(e);
        }
    }

}
