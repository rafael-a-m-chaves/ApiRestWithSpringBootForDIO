package com.dio.projetoSpring.model;

import lombok.*;


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

public class NivelAcesso {
     @Id
     @GeneratedValue
     private long id;
     @Column
     private String descricao;
}
