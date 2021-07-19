package com.dio.projetoSpring.model;

import lombok.*;
import org.hibernate.envers.Audited;
import org.springframework.data.relational.core.mapping.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Calendario {
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    private TipoData tipoData;
    @Column
    private String descricao;
    @Column
    private LocalDateTime dataEspecial;
}
