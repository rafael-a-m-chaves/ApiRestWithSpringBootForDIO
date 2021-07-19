package com.dio.projetoSpring.model;

import lombok.*;
import org.hibernate.envers.Audited;
import org.springframework.data.relational.core.mapping.Column;

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
public class BancoHoras {
    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public class BancoHorasId implements Serializable {
        private Long idBancoHoras;
        private Long idMovimento;
        private Long idUsuario;
    }
    @Id
    @EmbeddedId
    @GeneratedValue
    private BancoHorasId id;
    @Column
    private LocalDateTime dataTrabalhada;
    @Column
    private BigDecimal quantidadeHoras;
    @Column
    private BigDecimal saldoHoras;
}
