package br.com.bootcamp.exer11;

import java.time.LocalDate;

public class Carro extends Marca {
    private Proprietario proprietario;
    private Integer velocidadeMaxima;
    private Integer velocidadeAtual;
    private Integer numDeMarchas;
    private Integer quantidadeCombustivel;
    private Integer marchare;
    private Integer consumoMedio;
    private Integer marchaAtual = 1;

    public Carro(Integer quantidadeCombustivel,
                 Integer velocidadeMaxima,
                 Integer numDeMarchas,
                 Integer consumoMedio,
                 String moledo,
                 String cor,
                 LocalDate ano,
                 String marca,
                 String chassi,
                 Integer numDePortas,Proprietario proprietario) {
        super(moledo,cor,ano,marca,chassi,numDePortas);
        this.quantidadeCombustivel = quantidadeCombustivel;
        this.velocidadeMaxima = velocidadeMaxima;
        this.numDeMarchas = numDeMarchas;
        this.consumoMedio = consumoMedio;
        this.marchare = marchare;
        this.proprietario = proprietario;
        this.velocidadeAtual = 0;
    }

    public boolean acelera(Carro acelera){
        if(acelera.velocidadeAtual.equals(velocidadeMaxima)){
            System.out.println("ja ecedeu a velocidade máxima");
            return false;
        }
        else{
            acelera.velocidadeAtual = acelera.velocidadeAtual +1;
            System.out.println("velocidade atual é "+acelera.velocidadeAtual);
            return true;
        }
    }
    public boolean freia(Carro freia){
        if(freia.velocidadeAtual.equals(0)){
            System.out.println("carro já esta parado");
        }
        else {
            freia.velocidadeAtual = 0;
            System.out.println("velocidade atual após freiar"+freia.velocidadeAtual);
        }
        return true;
    }
    public boolean trocaMarcha(Carro trocaMarcha){
        if (trocaMarcha.marchaAtual > trocaMarcha.numDeMarchas){
            System.out.println("você essta na ultima marcha");
        }
        else {
            marchaAtual= marchaAtual+1;
            System.out.println("marcha atual é "+marchaAtual+"º");
        }
        return true;
    }
    public boolean reduzMarcha(Carro reduzMarcha){
        if(reduzMarcha.numDeMarchas< 0){
            System.out.println("você ja está na primeira marcha");
        }
        else {
            reduzMarcha.numDeMarchas = reduzMarcha.numDeMarchas -1;

        }
        return true;
    }

    public boolean engatarRe(Carro engatarRe){
        if (engatarRe.marchare.equals(velocidadeAtual.equals(0))){
            engatarRe.marchare = velocidadeAtual + 1;
            System.out.println("marcha ré engatada, velocidade atual é"+engatarRe.velocidadeAtual);
        }
        else{
            System.out.println("freie primeiro para depois engatar a marcha ré");
        }
        return true;
    }
    public void calcularAutonomia(Carro calcularAutonomia){
        System.out.println(calcularAutonomia.consumoMedio*calcularAutonomia.quantidadeCombustivel);
    }

    public Integer getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(Integer velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public Integer getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(Integer velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public Integer getNumDeMarchas() {
        return numDeMarchas;
    }

    public void setNumDeMarchas(Integer numDeMarchas) {
        this.numDeMarchas = numDeMarchas;
    }
}
