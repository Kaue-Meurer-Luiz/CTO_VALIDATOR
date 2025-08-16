package br.com.infoservic.ctoConference.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record UsuarioCadastroDto(

        @NotBlank(message = "Nome de Usuario é um campo Obrigatório!")
        String nome,

        String numeroContato,

        @NotBlank(message = "E-mail é um campo obrigatório!")
        @Email(message = "Digite um E-mail válido!")
        String email,

        @NotBlank(message = "A senha é obrigatória!")
        @Size(min = 8, message = "A senha deve conter ao menos 8 caracteres.")
        String senha,

        @NotBlank(message = "É obrigatorio definir a equipe que este usuario pertence!")
        String equipe,

        @NotBlank(message = "É obrigatorio definir qual a função do Usuario!")
        String funcao
) {
}