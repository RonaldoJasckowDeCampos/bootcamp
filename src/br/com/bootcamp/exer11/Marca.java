package br.com.bootcamp.exer11;

import java.time.LocalDate;
import java.time.Year;

public class Marca {
    private String moledo;
    private String cor;
    private LocalDate ano;
    private String marca;
    private String chassi;
    private Integer numDePortas;

    public Marca(String moledo, String cor,LocalDate ano, String marca, String chassi, Integer numDePortas) {
        this.moledo = moledo;
        this.cor = cor;
        this.ano = ano;
        this.marca = marca;
        this.chassi = chassi;
        this.numDePortas = numDePortas;
    }
}
