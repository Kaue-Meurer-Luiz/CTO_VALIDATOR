package br.com.infoservic.ctoConference.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record PortasCadastroDto(
        @NotNull(message = "O número da porta é obrigatório.")
        Integer nrPorta,
        @NotBlank(message = "O cliente é obrigatório.")
        String cliente,
        @NotBlank(message = "O status é obrigatório.")
        String status,
        Boolean plotado,
        String observacao
) {}