package br.com.bootcamp.exer7;

import java.math.BigDecimal;

public class ContaCorrente extends ContaBancaria {
   private BigDecimal limite;
   public ContaCorrente(Integer numeroConta, BigDecimal saldo,BigDecimal limite){
       super(numeroConta, saldo);
       this.limite = limite;
   }
    public void sacar(BigDecimal valor){
      // BigDecimal total = valor.add(limite);
       if( valor.compareTo(getSaldo()) <= 0 ){
           setSaldo(getSaldo().subtract(valor));
           System.out.println("saque realizado com sucesso,sobrou: "+getSaldo());
       }
       else if( valor.compareTo(getSaldo())> 0){
           setSaldo(getSaldo().add(limite.subtract(valor)));
           System.out.println("saque utilizando limite, restante de limite:"+getSaldo());
       }
     //  if(valor.compareTo(getSaldo().add(limite)))
    }
    public void depositar(BigDecimal valor) {
//        public void depositar(BigDecimal valor) {
//            //  BigDecimal total = valor.subtract();
//            setSaldo(getSaldo().add(valor));
//            System.out.println("depósito realizado com sucesso");
    }
    public void mostrarDados(){
        System.out.println("numero conta: "+getNumeroConta());
    }
}
