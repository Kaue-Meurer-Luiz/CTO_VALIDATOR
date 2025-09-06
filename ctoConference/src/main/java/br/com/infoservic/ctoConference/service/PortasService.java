package br.com.infoservic.ctoConference.service;

import br.com.infoservic.ctoConference.dto.PortasCadastroDto;
import br.com.infoservic.ctoConference.dto.PortasExibicaoDto;
import br.com.infoservic.ctoConference.exception.NaoEncontradoException;
import br.com.infoservic.ctoConference.model.Portas;
import br.com.infoservic.ctoConference.repository.PortasRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PortasService {

    @Autowired
    private PortasRepository portasRepository;


    public PortasExibicaoDto gravar(PortasCadastroDto portasCadastroDto) {
        Portas portas = new Portas();
        BeanUtils.copyProperties(portasCadastroDto, portas);
        return new PortasExibicaoDto(portasRepository.save(portas));
    }

    public PortasExibicaoDto buscarPorId(Long id){
        Optional<Portas> portasOptional = portasRepository.findById(id);
        if (portasOptional.isPresent()){
            return new PortasExibicaoDto(portasOptional.get());
        }else {
            throw new NaoEncontradoException("Porta não encontrada!");
        }
    }

    public List<PortasExibicaoDto> listarTodasAsPortas(){
        return portasRepository
                .findAll()
                .stream()
                .map(PortasExibicaoDto::new)
                .toList();
    }

    public void excluir(Long id){
        Optional<Portas> portasOptional = portasRepository.findById(id);
        if (portasOptional.isPresent()){
            portasRepository.delete(portasOptional.get());
        } else {
            throw new NaoEncontradoException("Porta não encontrada!");
        }
    }

    public Portas atualizar(Portas portas){
        Optional<Portas> portasOptional = portasRepository.findById(portas.getPortaId());
        if (portasOptional.isPresent()){
            return portasRepository.save(portas);
        } else {
            throw new NaoEncontradoException("Porta não encontrada!");
        }
    }


    public List<PortasExibicaoDto> buscarPeloCliente(String cliente) {
        List<Portas> portasList = portasRepository.findAllByCliente(cliente);
        if (portasList.isEmpty()) {
            throw new NaoEncontradoException("Cliente não encontrado!");
        }
        return portasList.stream()
                .map(PortasExibicaoDto::new)
                .collect(Collectors.toList());
    }
}
