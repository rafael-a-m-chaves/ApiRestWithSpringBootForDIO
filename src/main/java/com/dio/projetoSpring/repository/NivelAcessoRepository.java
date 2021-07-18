package com.dio.projetoSpring.repository;

import com.dio.projetoSpring.model.NivelAcesso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //class Repository
public interface NivelAcessoRepository extends JpaRepository<NivelAcesso,Long> {
}
