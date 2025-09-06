package br.com.infoservic.ctoConference.repository;

import br.com.infoservic.ctoConference.model.Portas;
import br.com.infoservic.ctoConference.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PortasRepository extends JpaRepository<Portas, Long> {


     Optional<Portas> findByCliente(String cliente);

     List<Portas> findAllByCliente(String cliente);


}
