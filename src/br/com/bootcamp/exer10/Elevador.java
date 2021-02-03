package br.com.bootcamp.exer10;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Elevador {
    private Integer andarAtual;
    private Integer totalAndares;
    private Integer capacidadeElevador;
    private Integer pessoasDentroElevador;

    public Elevador(Integer capacidadeElevador, Integer totalAndares,Integer andarAtual,Integer pessoasDentroElevador) {
        this.andarAtual = andarAtual;
        this.pessoasDentroElevador = pessoasDentroElevador;
        this.totalAndares = totalAndares;
        this.capacidadeElevador = capacidadeElevador;
    }

    public boolean entra(Elevador elevador) {
        if (elevador.pessoasDentroElevador <= elevador.capacidadeElevador){
            elevador.pessoasDentroElevador = elevador.pessoasDentroElevador+1;
            System.out.println("pessoa entrou no elevador");
            System.out.println("total de pessoas é = "+elevador.pessoasDentroElevador);
            return true;
        }
        else {
            System.out.println("nao há ninguem dentro do elevador");
            return false;
        }
    }
    public boolean sair(Elevador elevador){
        if(elevador.pessoasDentroElevador <= 0){
            System.out.println("não há ninguem no elevador");
            return false;
        }
        else{
            elevador.pessoasDentroElevador = elevador.pessoasDentroElevador -1;
            System.out.println("pessoa saiu");
            System.out.println("pessoas no elevador = "+elevador.pessoasDentroElevador);
            return true;
        }
    }
    public boolean sobe(Elevador elevador){
        if(elevador.andarAtual == elevador.totalAndares){
            System.out.println("nao é possivel subir, pois já esta no ultimo andar");
            return false;
        }
        else {
            elevador.andarAtual = elevador.andarAtual +1;
            System.out.println("andar atual é = "+elevador.andarAtual);
            return true;
        }
    }
    public boolean desce(Elevador elevador){
        if(elevador.andarAtual == 0){
            System.out.println("nao é possivel descer");
            return false;
        }
        else {
            elevador.andarAtual= elevador.andarAtual -1;
            System.out.println("andar atual é = "+elevador.andarAtual);
            return true;
        }
    }
}
