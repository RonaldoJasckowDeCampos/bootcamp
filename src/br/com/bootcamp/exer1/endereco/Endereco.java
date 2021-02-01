package br.com.bootcamp.exer1.endereco;

public class Endereco {
    private String endereco;
    private Integer numCasa;
    private String bairro;

    public Endereco (String endereco, Integer numCasa,String bairro){
        this.endereco = endereco;
        this.numCasa = numCasa;
        this.bairro = bairro;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setNumCasa(Integer numCasa) {
        this.numCasa = numCasa;
    }

    public Integer getNumCasa() {
        return numCasa;
    }

    public String getBairro() {
        return bairro;
    }

    public String getEndereco() {
        return endereco;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "endereco='" + endereco + '\'' +
                ", numCasa=" + numCasa +
                ", bairro='" + bairro + '\'' +
                '}';
    }
}