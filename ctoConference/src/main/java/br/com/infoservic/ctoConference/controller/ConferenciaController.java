package br.com.infoservic.ctoConference.controller;

import br.com.infoservic.ctoConference.dto.ConferenciaCadastroDto;
import br.com.infoservic.ctoConference.dto.ConferenciaExibicaoDto;
import br.com.infoservic.ctoConference.model.Conferencia;
import br.com.infoservic.ctoConference.service.ConferenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ConferenciaController {

    private ConferenciaService service;


    public ConferenciaController(ConferenciaService conferenciaService){
        this.service = conferenciaService;
    }

    @PostMapping("/conferencias")
    @ResponseStatus(HttpStatus.CREATED)
    public ConferenciaExibicaoDto gravar(@RequestBody ConferenciaCadastroDto conferenciaCadastroDto){
        return service.gravar(conferenciaCadastroDto);
    }


    @GetMapping(value = "/conferencia", params = {"dataInicio", "dataFinal"})
    public List<ConferenciaExibicaoDto> listarConferenciasPorPeriodo(
            @RequestParam LocalDate dataInicio,
            @RequestParam LocalDate dataFinal
    ) {
        return service.listarConferenciasPorPeriodo(dataInicio, dataFinal);
    }
}
