package br.com.bootcamp.exer5;

public class Exer5 {
    public static void main(String[]args){
//        Pessoa pessoa = new Empregado("ronaldo","123",0);
//        double valor1 =((Empregado)pessoa).calculValorTotalSalario();
//        System.out.println(valor1);
        Empregado empregado = new Empregado("ronaldo","123",1500,110);
        double valor =empregado.calculValorTotalSalario();
        System.out.println(valor);
    }
}
