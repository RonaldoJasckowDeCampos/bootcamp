package br.com.bootcamp.exer14.cliente;

public enum FormasDePagamento  {
    DINHEIRO("Dinheiro"),
    CARTAO("Cartão"),
    BOLETO("Boleto");
    private String informacao;
    FormasDePagamento(String informacao){
        this.informacao = informacao;
    }

    public String getInformacao() {
        return informacao;
    }
}
