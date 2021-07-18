package com.dio.projetoSpring.service;


import com.dio.projetoSpring.model.Ocorrencia;
import com.dio.projetoSpring.repository.OcorrenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class OcorrenciaService {

    OcorrenciaRepository ocorrenciaRepository;
    @Autowired //Constructor
    public OcorrenciaService(OcorrenciaRepository ocorrenciaRepository) {
        this.ocorrenciaRepository = ocorrenciaRepository;
    }

    //Method POST For save in DB
    public Ocorrencia save(Ocorrencia ocorrencia)
    {
        return ocorrenciaRepository.save(ocorrencia);
    }

    //Method GET For Find All Reg in DB
    public List<Ocorrencia> findall()

    {
        return ocorrenciaRepository.findAll();
    }

    //Method GET For Find Specific Reg in DB
    public Optional<Ocorrencia> getById(Long id)

    {
        return ocorrenciaRepository.findById(id);
    }

    //Method PUT For Update Specific Reg in DB
    public Ocorrencia update(Ocorrencia ocorrencia)
    {
        return ocorrenciaRepository.save(ocorrencia);
    }

    //Method Delete For Drop Specific Reg in DB
    public void delete(Long id){

        try {
            ocorrenciaRepository.deleteById(id);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

}
