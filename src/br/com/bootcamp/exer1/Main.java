package br.com.bootcamp.exer1;

import br.com.bootcamp.exer1.Telefone.Telefone;
import br.com.bootcamp.exer1.Telefone.TipoTelefone;
import br.com.bootcamp.exer1.endereco.Endereco;
import br.com.bootcamp.exer1.pessoa.Pessoa;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Ronaldo");
        pessoa.setSobrenome("jasckow");
        pessoa.setEmail("ronaldoapp");
        pessoa.setCpf("11331313");
        LocalDate dataNascimento = LocalDate.of(2000, Month.OCTOBER,8);
        pessoa.setDataNascimento(dataNascimento);
        List<Endereco> enderecoList = new ArrayList<>();
        Endereco endereco = new Endereco("adalias",179,"novo horizonte");
        enderecoList.add(endereco);
        pessoa.setEnderecoList(enderecoList);
        Telefone telefone = new Telefone();
        telefone.setTipoTelefone(TipoTelefone.CELULAR);
        telefone.setDdd(46);
        telefone.setNumero(9292292);
        pessoa.setTelefoneList(new ArrayList<>());
        pessoa.getTelefoneList().add(telefone);
        System.out.println(pessoa);
    }
}
