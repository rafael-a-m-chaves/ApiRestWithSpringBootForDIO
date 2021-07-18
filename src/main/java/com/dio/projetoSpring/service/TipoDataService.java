package com.dio.projetoSpring.service;


import com.dio.projetoSpring.model.TipoData;
import com.dio.projetoSpring.repository.TipoDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class TipoDataService {
    TipoDataRepository tipoDataRepository;

    @Autowired //Constructor
    public TipoDataService(TipoDataRepository tipoDataRepository)
    {
        this.tipoDataRepository = tipoDataRepository;
    }

    //Method POST For save in DB
    public TipoData save(TipoData tipoData)
    {
        return tipoDataRepository.save(tipoData);
    }

    //Method GET For Find All Reg in DB
    public List<TipoData> findall()

    {
        return tipoDataRepository.findAll();
    }

    //Method GET For Find Specific Reg in DB
    public Optional<TipoData> getById(Long id)

    {
        return tipoDataRepository.findById(id);
    }

    //Method PUT For Update Specific Reg in DB
    public TipoData update(TipoData tipoData)
    {
        return tipoDataRepository.save(tipoData);
    }

    //Method Delete For Drop Specific Reg in DB
    public void delete(Long id){

        try {
            tipoDataRepository.deleteById(id);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

}
