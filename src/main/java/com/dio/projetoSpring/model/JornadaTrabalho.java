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

public class JornadaTrabalho {
    @Id
    @Column
    @GeneratedValue
    private long id;
    @Column
    private String descricao;
}
