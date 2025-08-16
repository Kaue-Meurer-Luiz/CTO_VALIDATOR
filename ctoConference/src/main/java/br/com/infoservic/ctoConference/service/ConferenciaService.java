//package br.com.infoservic.ctoConference.service;
//
//import br.com.infoservic.ctoConference.repository.ConferenciaRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.time.LocalDate;
//import java.util.List;
//
//@Service
//public class ConferenciaService {
//
//    @Autowired
//    private ConferenciaRepository repository;
//
//
//    public List<ConferenciaExibicaoDto> listarConferenciasPorPeriodo(LocalDate dataInicial, LocalDate dataFinal){
//        return repository
//                .listarConferenciasPorPeriodo(dataInicial, dataFinal)
//                .stream()
//                .map(ConferenciaExibicaoDto::new)
//                .toList();
//
//    }
//}
