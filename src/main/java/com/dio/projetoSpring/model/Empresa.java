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

public class Empresa {
    @Id
    private long id;
    private String descricao;
    private String numero;
    private String endereco;
    private String cnpj;
    private String bairro;
    private String cidade;
    private String estado;
    private String telefone;
}
