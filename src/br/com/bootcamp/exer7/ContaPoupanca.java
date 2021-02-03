package br.com.bootcamp.exer7;

import java.math.BigDecimal;

public class ContaPoupanca extends ContaBancaria {

    private BigDecimal taxaDeOpecacao;

    public ContaPoupanca(Integer numeroConta, BigDecimal saldo, BigDecimal taxaDeOpecacao) {
        super(numeroConta, saldo);
        this.taxaDeOpecacao = taxaDeOpecacao;
    }

    @Override
    public void sacar(BigDecimal valor) {
     //BigDecimal sacar = new BigDecimal(String.valueOf(this.sacar));
    // BigDecimal saldo = new BigDecimal(String.valueOf(getSaldo()));
    // BigDecimal saldoFinal = new BigDecimal(String.valueOf(this.sacar -getSaldo()-this.taxaDeOpecacao));
        BigDecimal total = valor.add(taxaDeOpecacao);
        if( total.compareTo(getSaldo())<= 0){
          setSaldo(getSaldo().subtract(total));
            System.out.println("saldo final "+getSaldo());
        }
        else {
        System.out.println("saldo insuficiente para saque");
        }
    }

    @Override
    public void depositar(BigDecimal valor) {
      //  BigDecimal total = valor.subtract();
        setSaldo(getSaldo().add(valor.subtract(taxaDeOpecacao)));
        System.out.println("depósito realizado com sucesso "+getSaldo());

    }
    //    public BigDecimal SaldoFinal(){
//        BigDecimal sacar = new BigDecimal(String.valueOf(getSacar()));
//        BigDecimal saldo = new BigDecimal(String.valueOf((getSaldo()));
//        BigDecimal saldoFinal = sacar.negate(saldo);
//
//    }
    public void mostrarDados(){
        System.out.println("numero conta: "+getNumeroConta()+" saldo: " +getSaldo()+" taxa "+taxaDeOpecacao);
    }

}