package com.dio.projetoSpring.model;


import lombok.*;
import org.springframework.data.relational.core.mapping.Column;
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

public class CategoriaUsuario {
    @Id
    @GeneratedValue
    private long id;
    @Column
    private String descricao;
}
