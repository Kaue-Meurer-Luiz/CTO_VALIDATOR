package br.com.infoservic.ctoConference.controller;

import br.com.infoservic.ctoConference.dto.PortasCadastroDto;
import br.com.infoservic.ctoConference.dto.PortasExibicaoDto;
import br.com.infoservic.ctoConference.model.Portas;
import br.com.infoservic.ctoConference.service.PortasService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PortasController {

    @Autowired
    private PortasService service;

    @PostMapping("/portas")
    @ResponseStatus(HttpStatus.CREATED)
    public PortasExibicaoDto gravar(@RequestBody @Valid PortasCadastroDto portasCadastroDto){
        return service.gravar(portasCadastroDto);
    }

    @GetMapping("/portas")
    @ResponseStatus(HttpStatus.OK)
    public List<PortasExibicaoDto> listarTodasAsPortas(){ return service.listarTodasAsPortas();}


    @DeleteMapping("/portas/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void excluir(@PathVariable Long id){service.excluir(id);}


    @PutMapping("/portas")
    @ResponseStatus(HttpStatus.OK)
    public Portas atualizar(@RequestBody Portas portas){return service.atualizar(portas);}


    @GetMapping("/portas/cliente/{cliente}")
    public PortasExibicaoDto buscarClientePorNome(@PathVariable String cliente){return service.buscarPeloCliente(cliente);}

    @GetMapping("portas/id/{id}")
    @ResponseStatus(HttpStatus.OK)
    public PortasExibicaoDto buscarPortaPorId(@PathVariable Long id){return service.buscarPorId(id);}

}
