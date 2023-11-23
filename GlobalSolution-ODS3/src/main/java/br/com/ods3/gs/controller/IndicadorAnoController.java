package br.com.ods3.gs.controller;

import br.com.ods3.gs.model.IndicadorAno;
import br.com.ods3.gs.model.Objetivo;
import br.com.ods3.gs.service.IndicadorAnoService;
import br.com.ods3.gs.service.ObjetivoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
@RestController
@RequestMapping("/indicador")
public class IndicadorAnoController {

        @Autowired
        private IndicadorAnoService indicadorAnoService;

        @GetMapping("/{id}")
        @ResponseStatus(HttpStatus.OK)
        public IndicadorAno buscarIndicadorPorId(@PathVariable Long id){
                return indicadorAnoService.buscaPorId(id)
                        .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Indicador Nao encontrado"));
        }



}
