package br.com.bootcamp.exer7;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<ContaBancaria> bancoList = new ArrayList<>();

    public void setInserir (ContaBancaria conta) {
       if(existeConta(conta)) {
           System.out.println("conta já existe");
       }
       else bancoList.add(conta);
    }
    private boolean existeConta(ContaBancaria conta){
        return  bancoList.contains(conta);
    }

    public boolean procurar (ContaBancaria conta){
        for (int i= 0; i < bancoList.size();i++){
            if(bancoList.contains(conta)){
                System.out.println("conta Encontrada");
                return true;
            }
        }
        System.out.println("conta nao existe");
        return false;
    }

    public boolean remover(ContaBancaria conta){
        if(bancoList.remove(conta)){
            System.out.println("conta removida com sucesso");
            return true;
        }
            System.out.println("nao existe essa conta");
            return false;
    }

}