package br.com.infoservic.ctoConference.dto;

import br.com.infoservic.ctoConference.model.Portas;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.List;

public record ConferenciaCadastroDto(
        @NotBlank(message = "É obrigatorio definir qual caixa está conferindo")
        String caixa,

        @NotBlank(message = "É obrigatorio definir qual a cidade que está realizando a conferencia!")
        String cidade,

        @NotNull(message = "É obrigatorio definir qual a data que está realizando a conferencia!")
        LocalDateTime dataConferencia,
        String observacao,

        @NotNull(message = "É obrigatorio definir qual Tecnico interno está realizando a conferencia!")
        Long tecInterno_id,

        @NotNull(message = "É obrigatorio definir qual Tecnico Externo está realizando a conferencia!")
        Long tecExterno_id,

        @Valid
        List<PortasCadastroDto> portas
){}
