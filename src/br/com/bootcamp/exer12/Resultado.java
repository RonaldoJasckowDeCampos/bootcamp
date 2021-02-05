package br.com.bootcamp.exer12;

public class Resultado {
    private Especies especie;
    private Integer quantidade;

    public Resultado(Especies especie, Integer quantidade) {
        this.especie = especie;
        this.quantidade = quantidade;
    }

    public void setEspecie(Especies especie) {
        this.especie = especie;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
}
