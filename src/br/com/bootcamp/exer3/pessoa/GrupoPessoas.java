package br.com.bootcamp.exer3.pessoa;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GrupoPessoas {
    private List<Pessoa>pessoaList = new ArrayList<>();
    public void addPessoa (Pessoa pessoa ) {
        if ( LocalDate.now().getYear()- pessoa.getDataNascimento().getYear() >= 18) {
            this.pessoaList.add(pessoa);
            System.out.println("Pessoa adicionada");
        } else {
            System.out.println("pessoa nao adicionada");
        }

    }

    public List<Pessoa> getPessoaList(){
        return pessoaList;
    }

}
