package br.com.infoservic.ctoConference.model;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name ="IS_TBL_PORTAS")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Portas {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "SEQ_PORTAS"
    )
    @SequenceGenerator(
            name = "SEQ_PORTAS",
            sequenceName = "SEQ_PORTAS",
            allocationSize = 1
    )
    private Long portaId;
    private Integer nrPorta;
    private String cliente;
    private String status;
    private Boolean plotado;
    private String observacao;
}
