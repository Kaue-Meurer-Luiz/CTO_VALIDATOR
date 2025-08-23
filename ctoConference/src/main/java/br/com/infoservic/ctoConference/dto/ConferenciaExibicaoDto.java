//package br.com.infoservic.ctoConference.dto;
//
//import br.com.infoservic.ctoConference.model.Conferencia;
//import br.com.infoservic.ctoConference.model.Portas;
//import jakarta.validation.constraints.NotBlank;
//
//import java.time.LocalDate;
//import java.util.List;

//public record ConferenciaExibicaoDto(
//        String caixa,
//        String cidade,
//        LocalDate dataConferencia,
//        String observacao,
//        Long tecInterno_id,
//        List<Portas> portas
//) {
//    public ConferenciaExibicaoDto (Conferencia conferencia){
//        this(
//                conferencia.getCaixa(),
//                conferencia.getCidade(),
//                conferencia.getDataConferencia(),
//                conferencia.getObservação(),
//                conferencia.getUsuario(),
//        );
//    }
//}
