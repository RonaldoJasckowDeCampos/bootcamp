package br.com.bootcamp.exer14.item;

public class Item  {
    private Integer id;
    private String descricao;
    private boolean inativo;
    private Integer quantidadeEstoque;
    private double valorUnitario;

    public Item(Integer id, String descricao, boolean inativo, Integer quantidadeEstoque, double valorUnitario) {
        this.id = id;
        this.descricao = descricao;
        this.inativo = inativo;
        this.quantidadeEstoque = quantidadeEstoque;
        this.valorUnitario = valorUnitario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isInativo() {
        return inativo;
    }

    public void setInativo(boolean inativo) {
        this.inativo = inativo;
    }

    public Integer getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(Integer quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

}
