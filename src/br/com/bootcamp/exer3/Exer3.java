package br.com.bootcamp.exer3;

import br.com.bootcamp.exer3.pessoa.GrupoPessoas;
import br.com.bootcamp.exer3.pessoa.Pessoa;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Exer3 {
    public static void main(String[]args) {
        Pessoa pessoa1 = new Pessoa("Ronaldo","jasckow","113463",20,"ronaldoapp", LocalDate.of(2000,Month.OCTOBER,11));
        GrupoPessoas pessoas = new GrupoPessoas();
        pessoas.addPessoa(pessoa1);
        Pessoa pessoa2 = new Pessoa("leonardo","yuri","11124",17,"leoyuri", LocalDate.of(2003,Month.MAY,30));
        pessoas.addPessoa(pessoa2);
        for (int i= 0; i < pessoas.getPessoaList().size();i++){
            System.out.println(pessoas.getPessoaList().get(i));
        }
    }
}
