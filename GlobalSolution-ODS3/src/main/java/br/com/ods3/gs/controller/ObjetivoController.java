package br.com.ods3.gs.controller;

import br.com.ods3.gs.model.Objetivo;
import br.com.ods3.gs.service.ObjetivoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/objetivos")
public class ObjetivoController {
    @Autowired
    private ObjetivoService objetivoService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List <Objetivo> listaObjetivos(){
        return objetivoService.listaObjetivo();
    }


}
