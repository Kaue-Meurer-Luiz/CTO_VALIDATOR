package br.com.infoservic.ctoConference.dto;

import br.com.infoservic.ctoConference.model.Portas;

public record PortasExibicaoSimplesDto(
        //Long portaId,
        Integer nrPorta,
        String cliente,
        String status,
        //Boolean plotado,
        String observacao,
        ConferenciaSimplesDto conferenciaSimplesDto
) {
    public PortasExibicaoSimplesDto(Portas portas){
        this(
                //portas.getPortaId(),
                portas.getNrPorta(),
                portas.getCliente(),
                portas.getStatus(),
                //portas.getPlotado(),
                portas.getObservacao(),
                new ConferenciaSimplesDto(portas.getConferencia())
        );
    }
}
