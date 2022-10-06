package com.alticci.alticci;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin("*")
@RequestMapping("/alticci")
public class SequenciaAlticciController {

    @Autowired
    private SequenciaAlticciService alticciService;

    public SequenciaAlticciController(SequenciaAlticciService alticciService) {
        this.alticciService = alticciService;
    }

    @GetMapping(path = "/inserir/{valor}")
    public ArrayList<String> buscaSequenciaAlticci(@PathVariable("valor") int valor) {

        this.alticciService.somaSequenciaAlticci(valor);

        ArrayList<String> result = new ArrayList<>();
        for (int i = valor; i <= 20; i++) {
            result.add(alticciService.somaSequenciaAlticci(i)+" ");
        }

        return result;
    }

}
