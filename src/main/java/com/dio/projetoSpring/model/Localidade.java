package com.dio.projetoSpring.model;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity

public class Localidade {
    @Id
    @GeneratedValue
    private long id;
    @ManyToOne
    private NivelAcesso nivelAcesso;
    @Column
    private String descricao;
}
