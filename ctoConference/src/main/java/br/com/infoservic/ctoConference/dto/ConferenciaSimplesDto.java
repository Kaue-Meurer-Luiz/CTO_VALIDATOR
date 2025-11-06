package br.com.infoservic.ctoConference.dto;

import br.com.infoservic.ctoConference.model.Conferencia;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;

public record ConferenciaSimplesDto(
        Long idConferencia,
        String caixa,
        String cidade,
        LocalDateTime dataConferencia
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
