package br.com.bootcamp.exer5;

import java.util.ArrayList;
import java.util.List;

public class Exer5 {
    public static void main(String[]args){
//        Pessoa pessoa = new Empregado("ronaldo","123",0);
//        double valor1 =((Empregado)pessoa).calculValorTotalSalario();
//        System.out.println(valor1);
        Empregado empregado = new Empregado("ronaldo","123",1500,110);
        double salarioEmpregado =empregado.calculValorTotalSalario();
        System.out.println("salario Empregada "+salarioEmpregado);

        EmpregadoComissionado vendedor1 = new EmpregadoComissionado("jeni","134",
                1500,110,5000,10);
        double salarioComissionado = vendedor1.calculValorTotalSalario();
        System.out.println("salario vendedor 1= "+salarioComissionado);

        EmpregadoComissionado vendedor2 = new EmpregadoComissionado("bobina","112",
                1500,110,6000,10);
        double salarioComissionado2 = vendedor2.calculValorTotalSalario();
        System.out.println("salario vendedor 2= "+salarioComissionado2);

        List<EmpregadoComissionado> vendedores = new ArrayList<>();
        vendedores.add(vendedor1);
        vendedores.add(vendedor2);

        Gerente gerente = new Gerente("paizao",
                "111",

                1500,
                110,
                1000,vendedores,20
                );
       double salariogerente = gerente.calculValorTotalSalario();
        System.out.println("salario Gentente = "+salariogerente+", gerenciando: "+vendedor1.getNome()+" e "+vendedor2.getNome()+", empregado: "+empregado.getNome());
    }
}
