package br.com.bootcamp.exer11;


import java.time.LocalDate;

public class Proprietario extends Endereco {
    private String nome;
    private String cpf;
    private Integer rg;
    private LocalDate dataNascimento;

    public Proprietario (String nome, String cpf,Integer rg,String rua,Integer numero, String bairro,String cidade,String cep,String complemento) {
        super(rua,numero,bairro,cidade,cep,complemento);
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
    }
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Integer getRg() {
        return rg;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setRg(Integer rg) {
        this.rg = rg;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }


}
