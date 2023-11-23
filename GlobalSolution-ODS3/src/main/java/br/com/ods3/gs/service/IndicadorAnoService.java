package br.com.ods3.gs.service;

import br.com.ods3.gs.model.IndicadorAno;
import br.com.ods3.gs.model.Objetivo;
import br.com.ods3.gs.repository.IndicadorAnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class IndicadorAnoService {
    @Autowired
    private IndicadorAnoRepository indicadorAnoRepository;

    public Optional<IndicadorAno> buscaPorId(Long id){
        return indicadorAnoRepository.findById(id);
    }
//public Optional<IndicadorAno> buscaPorId(Long id) {
//    System.out.println("Searching for IndicadorAno with id: " + id);
//    Optional<IndicadorAno> result = indicadorAnoRepository.findById(id);
//    System.out.println("Result: " + result);
//    return result;
//}

}
