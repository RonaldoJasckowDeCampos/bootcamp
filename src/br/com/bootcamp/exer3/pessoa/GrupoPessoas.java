package br.com.bootcamp.exer3.pessoa;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public class GrupoPessoas {
    private Integer maiorIdade;
    private Integer menorIdade;
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
    public Integer getMaiorIdade() {
        if (!pessoaList.isEmpty()) {
            maiorIdade = LocalDate.now().getYear() - pessoaList.get(0).getDataNascimento().getYear();
            for (int i = 1; i < pessoaList.size(); i++) {
                if (maiorIdade < (LocalDate.now().getYear() - pessoaList.get(i).getDataNascimento().getYear())) {
                    maiorIdade = LocalDate.now().getYear() - pessoaList.get(i).getDataNascimento().getYear();
                }
            }
        }
        return maiorIdade;
    }
    public Integer getMenorIdade() {
        if (!pessoaList.isEmpty()) {
            maiorIdade = LocalDate.now().getYear() - pessoaList.get(0).getDataNascimento().getYear();
            for (int i = 1; i < pessoaList.size(); i++) {
                if (maiorIdade > (LocalDate.now().getYear() - pessoaList.get(i).getDataNascimento().getYear())) {
                    menorIdade = LocalDate.now().getYear() - pessoaList.get(i).getDataNascimento().getYear();
                }
            }
        }
        return menorIdade;
    }

}
