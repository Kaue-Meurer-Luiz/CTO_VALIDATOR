//package br.com.infoservic.ctoConference.repository;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//
//import java.time.LocalDate;
//import java.util.List;
//
//public interface ConferenciaRepository extends JpaRepository  {
//
//    @Query("SELECT c FROM Conferencia c WHERE c.dataConferencia BETWEEN :dataInicial AND :dataFinal")
//    List<Conferencia> listarConferenciasPorPeriodo(
//            @Param("dataInicial") LocalDate dataInicial,
//            @Param("dataFinal") LocalDate dataFinal
//    );
//}
