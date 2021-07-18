package com.dio.projetoSpring.repository;

import com.dio.projetoSpring.model.TipoData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoDataRepository extends JpaRepository<TipoData,Long> {
}
