package com.dio.projetoSpring.service;


import com.dio.projetoSpring.model.JornadaTrabalho;
import com.dio.projetoSpring.repository.JornadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class JornadaService {

    JornadaRepository jornadaRepository;

    @Autowired //Constructor
    public JornadaService(JornadaRepository jornadaRepository)

    {
        this.jornadaRepository = jornadaRepository;
    }

    //Method POST For save in DB
    public JornadaTrabalho saveJornada(JornadaTrabalho jornadaTrabalho)
    {
       return jornadaRepository.save(jornadaTrabalho);
    }

    //Method GET For Find All Reg in DB
    public List<JornadaTrabalho> findall()
    {
        return jornadaRepository.findAll();
    }

    //Method GET For Find Specific Reg in DB
    public Optional<JornadaTrabalho> getById(Long idJornada)
    {
       return jornadaRepository.findById(idJornada);
    }

    //Method PUT For Update Specific Reg in DB
    public JornadaTrabalho updateJornada(JornadaTrabalho jornadaTrabalho)
    {
        return jornadaRepository.save(jornadaTrabalho);
    }

    //Method Delete For Drop Specific Reg in DB
    public void deleteJornada(Long idjornada){
        try {
           jornadaRepository.deleteById(idjornada);
       }catch (Exception e){
           System.out.println(e.getMessage());
       }

    }

}
