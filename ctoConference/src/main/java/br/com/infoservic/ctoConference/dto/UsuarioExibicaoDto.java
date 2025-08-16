package br.com.infoservic.ctoConference.dto;

import br.com.infoservic.ctoConference.model.Usuario;

public record UsuarioExibicaoDto(
        Long id,
        String nome,
        String numeroContato,
        String equipe,
        String funcao
) {
    public UsuarioExibicaoDto(Usuario usuario){
        this(
                usuario.getId(),
                usuario.getNome(),
                usuario.getNumeroContato(),
                usuario.getEquipe(),
                usuario.getFuncao());
    }

}
