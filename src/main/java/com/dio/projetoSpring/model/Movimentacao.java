package com.dio.projetoSpring.model;

import lombok.*;
import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity

public class Movimentacao {
    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public class MovimentacaoId implements Serializable {
        private Long idMovimento;
        private Long idUsuario;
    }
    @Id
    @EmbeddedId
    @GeneratedValue
    private MovimentacaoId id;
    @Column
    private LocalDateTime dataEntrada;
    @Column
    private LocalDateTime dataSaida;
    @Column
    private BigDecimal periodo;
    @ManyToOne
    private Ocorrencia ocorrencia;
    @ManyToOne
    private Calendario calendario;
}
