package br.com.bootcamp.exer5;

import java.util.ArrayList;
import java.util.List;

public class Gerente extends EmpregadoComissionado{
    private double ajudaDeCustosDespesas;
    private List<EmpregadoComissionado> vendedores =  new ArrayList<>();

    public Gerente(String nome,
                   String cpf,
                   double valorSalarioBase,
                   double valorImpostos,
                   double ajudaDeCustosDespesas,
                   List<EmpregadoComissionado> vendedores,
                   double percentualComissao){
       super (nome,cpf,valorSalarioBase,valorImpostos, getTotal(vendedores),percentualComissao);
       this.ajudaDeCustosDespesas = ajudaDeCustosDespesas;
    }

    public static double getTotal(List<EmpregadoComissionado> vendedores){
        double total1=0;
        for (int i = 0; i < vendedores.size(); i++){
           total1 += vendedores.get(i).getValorProdutoVendido();
        }
        return total1;
    }

    public double calculValorTotalSalario(){
       //1500 + 2200 + 1000 - 110
        return getValorSalarioBase() + getValorComissao() + ajudaDeCustosDespesas - getValorImpostos();
    }
}
