//package br.com.infoservic.ctoConference.controller;
//
//import br.com.infoservic.ctoConference.service.ConferenciaService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.time.LocalDate;
//import java.util.List;
//
//@RestController
//@RequestMapping("/api")
//public class ConferenciaController {
//
//    @Autowired
//    private ConferenciaService service;
//
//    @GetMapping(value = "/conferencia", params = {"dataInicio", "dataFinal"})
//    public List<ConferenciaExibicaoDto> listarConferenciasPorPeriodo(
//            @RequestParam LocalDate dataInicio,
//            @RequestParam LocalDate dataFinal
//    ) {
//        return service.listarConferenciasPorPeriodo(dataInicio, dataFinal);
//    }
//}
