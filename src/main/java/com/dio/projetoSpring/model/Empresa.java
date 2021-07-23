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
public class Empresa {
    @Id
    @GeneratedValue
    private long id;
    @Column
    private String descricao;
    @Column
    private String numero;
    @Column
    private String endereco;
    @Column
    private String cnpj;
    @Column
    private String bairro;
    @Column
    private String cidade;
    @Column
    private String estado;
    @Column
    private String telefone;
}
