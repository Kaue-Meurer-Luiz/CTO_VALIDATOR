package br.com.infoservic.ctoConference.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;

@Entity
@Table(name = "IS_TBL_USUARIO")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Usuario {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "IS_TBL_USUARIO_SEQ")
    @SequenceGenerator(
            name = "IS_TBL_USUARIO_SEQ",
            sequenceName = "IS_TBL_USUARIO_SEQ",
            allocationSize = 1)
    private Long id;

    private String nome;

    @Column(name = "numero_contato")
    private String numeroContato;
    private String email;
    private String senha;
    private String equipe;
    private String funcao;


}
