package br.com.bootcamp.exer7;

import java.math.BigDecimal;

public abstract class ContaBancaria implements  Imprimivel{

    private Integer numeroConta;
    private BigDecimal  saldo;
    public abstract void sacar(BigDecimal valor);
    public abstract void depositar(BigDecimal valor);

    public ContaBancaria(Integer numeroConta, BigDecimal saldo){
       this.numeroConta = numeroConta;
       this.saldo = saldo;
    }

    public BigDecimal  getSaldo() {
        return saldo;
    }

    public Integer getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(Integer numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setSaldo(BigDecimal  saldo) {
        this.saldo = saldo;
    }


}
