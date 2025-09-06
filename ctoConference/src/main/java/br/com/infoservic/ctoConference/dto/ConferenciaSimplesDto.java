package br.com.infoservic.ctoConference.dto;

import br.com.infoservic.ctoConference.model.Conferencia;

import java.time.LocalDate;

public record ConferenciaSimplesDto(
        Long idConferencia,
        String caixa,
        String cidade,
        LocalDate dataConferencia
) {
    public ConferenciaSimplesDto(Conferencia conferencia) {
        this(
                conferencia.getIdConferencia(),
                conferencia.getCaixa(),
                conferencia.getCidade(),
                conferencia.getDataConferencia()
        );
    }
}
