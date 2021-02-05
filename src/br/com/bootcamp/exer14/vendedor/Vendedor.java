package br.com.bootcamp.exer14.vendedor;

public class Vendedor {
    private Integer id;
    private String nome;
    private Integer comissao;
    private Integer descontoMax;

    public Vendedor(Integer id, String nome, Integer comissao, Integer descontoMax) {
        this.id = id;
        this.nome = nome;
        this.comissao = comissao;
        this.descontoMax = descontoMax;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getComissao() {
        return comissao;
    }

    public void setComissao(Integer comissao) {
        this.comissao = comissao;
    }

    public Integer getDescontoMax() {
        return descontoMax;
    }

    public void setDescontoMin(Integer descontoMin) {
        this.descontoMax = descontoMin;
    }
}
