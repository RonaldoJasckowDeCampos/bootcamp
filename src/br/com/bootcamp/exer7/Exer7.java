package br.com.bootcamp.exer7;

import java.math.BigDecimal;

public class Exer7 {
    public static void main(String[]args){
        ContaBancaria conta1 = new ContaPoupanca(912794,new BigDecimal(1500),new BigDecimal(2));
        conta1.sacar(new BigDecimal(100));
        conta1.depositar(new BigDecimal(150));
        ContaCorrente conta2 = new ContaCorrente(912794,new BigDecimal(1000),new BigDecimal(500));
        conta2.sacar(new BigDecimal(1001));
    }

}
