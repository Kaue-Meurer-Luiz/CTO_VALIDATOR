package br.com.infoservic.ctoConference.model;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name ="IS_TBL_CONFERENCIA")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Conferencia {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "SEQ_CONFERENCIA"
    )
    @SequenceGenerator(
            name = "SEQ_CONFERENCIA",
            sequenceName = "SEQ_CONFERENCIA",
            allocationSize = 1
    )
    private Long idConferencia;

    private String caixa;
    private String cidade;
    private LocalDate dataConferencia;
    private String observacao;

    // quem fez a conferência interno
    @ManyToOne
    @JoinColumn(name = "TECINTERNO_ID", nullable = false)
    private Usuario tecInternoId;

    // quem fez a conferência externa
    @ManyToOne
    @JoinColumn(name = "TECEXTERNO_ID", nullable = false)
    private Usuario tecExternoId;

    // várias portas vinculadas
    @OneToMany(mappedBy = "conferencia", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Portas> portas = new ArrayList<>();

    // helper para adicionar portas
    public void addPorta(Portas porta) {
        porta.setConferencia(this);
        portas.add(porta);
    }
}
