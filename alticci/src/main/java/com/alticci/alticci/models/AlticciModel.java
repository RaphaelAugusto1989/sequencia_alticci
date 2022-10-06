package com.alticci.alticci.models;

public class AlticciModel {

    private int numero;

    public AlticciModel(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "AlticciModel{" +
                "numero=" + numero +
                '}';
    }
}
