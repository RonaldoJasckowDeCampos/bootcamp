package br.com.bootcamp.exer3.pessoa;

import java.time.LocalDate;
import java.util.ArrayList;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private Integer idade;
    private String cpf;
    private String email;
    private LocalDate dataNascimento;
    public Pessoa(String nome,String sobrenome,String cpf,Integer idade,String email,LocalDate dataNascimento){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.cpf = cpf;
        this.email = email;
        this.dataNascimento = dataNascimento;
    }
    public void setNome(String nome){this.nome = nome;}
    public void setSobrenome(String sobrenome){this.sobrenome = sobrenome;}
    public void setCpf(String cpf){this.cpf = cpf;}
    public void setEmail(String email){this.email = email;}
    public void setIdade(Integer idade){this.idade = idade;}
    public void setDataNascimento(LocalDate dataNascimento){this.dataNascimento = dataNascimento;}
//    public String getNome(){ return nome;}
//    public String getSobrenome(){return sobrenome;}
//    public String getCpf(){return cpf;}
//    public Integer getIdade(){return idade;}
   public LocalDate getDataNascimento(){return dataNascimento;}
}
