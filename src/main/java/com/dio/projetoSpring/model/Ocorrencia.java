package com.dio.projetoSpring.model;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity

public class Ocorrencia {
    @Id
    private Long id;
    private String nome;
    private String descricao;
}
