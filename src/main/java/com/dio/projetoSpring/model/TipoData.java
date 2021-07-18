package com.dio.projetoSpring.model;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class TipoData {
    @Id
    @GeneratedValue
    private Long id;
    @Column
    private String descricao;
}
