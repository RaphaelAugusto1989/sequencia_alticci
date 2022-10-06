package com.alticci.alticci;

import org.springframework.stereotype.Service;

@Service
public class SequenciaAlticciService {

    public int somaSequenciaAlticci(int valor) {

        return (valor < 2) ? valor : somaSequenciaAlticci(valor - 1) + somaSequenciaAlticci(valor - 2);

    }
}
