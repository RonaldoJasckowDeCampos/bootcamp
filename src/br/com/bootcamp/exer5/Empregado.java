package br.com.bootcamp.exer5;

public class Empregado extends Pessoa {
    private double valorSalarioBase;
    private double valorImpostos;
        public Empregado(String nome, String cpf,double valorSalarioBase,double valorImpostos){
            super(nome,cpf);
            this.valorSalarioBase = valorSalarioBase;
            this.valorImpostos = valorImpostos;
        }
        public double calculValorTotalSalario(){
            return valorSalarioBase - valorImpostos;
        }
}

