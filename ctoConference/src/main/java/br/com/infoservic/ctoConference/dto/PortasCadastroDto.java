package br.com.infoservic.ctoConference.dto;

import jakarta.validation.constraints.NotBlank;

public record PortasCadastroDto(
        Long portaId,

        @NotBlank(message = "É obrigatorio definir qual porta está conferindo")
        Integer nrPorta,
        String cliente,
        String status,
        Boolean plotado,
        String observacao
) {
}
