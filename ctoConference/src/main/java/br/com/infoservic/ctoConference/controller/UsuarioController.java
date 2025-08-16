package br.com.infoservic.ctoConference.controller;

import br.com.infoservic.ctoConference.dto.UsuarioCadastroDto;
import br.com.infoservic.ctoConference.dto.UsuarioExibicaoDto;
import br.com.infoservic.ctoConference.model.Usuario;
import br.com.infoservic.ctoConference.service.UsuarioService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UsuarioController {

    @Autowired
    private UsuarioService service;


    @PostMapping("/usuarios")
    @ResponseStatus(HttpStatus.CREATED)
    public UsuarioExibicaoDto gravar(@RequestBody @Valid UsuarioCadastroDto usuarioCadastroDto){
        return service.gravar(usuarioCadastroDto);
    }

    @GetMapping("/usuarios")
    @ResponseStatus(HttpStatus.OK)
    public List<UsuarioExibicaoDto> listarTodosUsuarios(){
        return service.listarTodosUsuarios();
    }


    @DeleteMapping("/usuarios/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void excluir(@PathVariable Long id){
        service.excluir(id);
    }

    @PutMapping("/usuarios")
    @ResponseStatus(HttpStatus.OK)
    public Usuario atualizar(@RequestBody Usuario usuario) {
        return service.atualizar(usuario);
    }

    @GetMapping("/usuarios/nome/{nome}")
    @ResponseStatus(HttpStatus.OK)
    public UsuarioExibicaoDto buscarUsuarioPorNome(@PathVariable String nome){
        return service.buscarPeloNome(nome);
    }

    @GetMapping("/usuarios/id/{id}")
    @ResponseStatus(HttpStatus.OK)
    public UsuarioExibicaoDto buscarUsuarioPorId(@PathVariable Long id){
        return service.buscarPorId(id);
    }


}
