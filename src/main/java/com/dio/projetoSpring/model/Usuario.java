package com.dio.projetoSpring.model;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Usuario {
    @Id
    private Long id;

    @ManyToOne
    private CategoriaUsuario categoriaUsuario;
    @Column
    private String nome;

    @ManyToOne
    private Empresa empresa;

    @ManyToOne
    private NivelAcesso nivelAcesso;

    @ManyToOne
    private JornadaTrabalho jornadaTrabalho;
    @Column
    private BigDecimal tolerancia;
    @Column
    @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm")
    private LocalDateTime inicioJornada;
    @Column
    @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm")
    private LocalDateTime finalJornada;

}
