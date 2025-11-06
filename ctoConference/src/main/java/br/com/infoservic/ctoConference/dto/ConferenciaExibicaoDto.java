package br.com.infoservic.ctoConference.dto;

import br.com.infoservic.ctoConference.model.Conferencia;
import br.com.infoservic.ctoConference.model.Portas;
import br.com.infoservic.ctoConference.model.Usuario;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.List;

public record ConferenciaExibicaoDto(
        Long idConferencia,
        String caixa,
        String cidade,
        LocalDateTime dataConferencia,
        String observacao,
        UsuarioExibicaoDto tecInterno,
        UsuarioExibicaoDto tecExterno,
        List<PortasExibicaoDto> portas
) {
    public ConferenciaExibicaoDto(Conferencia conferencia) {
        this(
                conferencia.getIdConferencia(),
                conferencia.getCaixa(),
                conferencia.getCidade(),
                conferencia.getDataConferencia(),
                conferencia.getObservacao(),
                new UsuarioExibicaoDto(conferencia.getTecInternoId()),
                new UsuarioExibicaoDto(conferencia.getTecExternoId()),
                conferencia.getPortas().stream()
                        .map(PortasExibicaoDto::new)
                        .toList()
        );
    }
}
