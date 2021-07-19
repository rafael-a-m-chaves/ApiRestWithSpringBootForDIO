package com.dio.projetoSpring.repository;

import com.dio.projetoSpring.model.Calendario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CalendarioRepository extends JpaRepository<Calendario,Long> {
}
