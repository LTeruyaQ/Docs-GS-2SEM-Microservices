package br.com.ods3.gs.service;

import br.com.ods3.gs.model.Objetivo;
import br.com.ods3.gs.repository.DescricaoIndicadorRepository;
import br.com.ods3.gs.repository.IndicadorAnoRepository;
import br.com.ods3.gs.repository.ObjetivoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ObjetivoService {
    @Autowired
    private ObjetivoRepository objetivoRepository;
    @Autowired
    private DescricaoIndicadorRepository descricaoIndicadorRepository;
    @Autowired
    private IndicadorAnoRepository  indicadorAnoRepository;
    public List<Objetivo>listaObjetivo(){
        return objetivoRepository.findAll();
    }

    public Optional<Objetivo> buscaPorId(Long id){
        return objetivoRepository.findById(id);
    }




}
